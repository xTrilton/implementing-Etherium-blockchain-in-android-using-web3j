package com.example.etherium;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;
import java.io.File;
import java.math.BigDecimal;
import java.security.Provider;
import java.security.Security;

public class Web3Activity extends AppCompatActivity {

   Web3j web3;
    File file;
    String Walletname;
    Credentials credentials;
    TextView txtaddress;

    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blockchain_layout);
        txtaddress=findViewById(R.id.text_address);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
       StrictMode.setThreadPolicy(policy);
//enter your own infura api key below
        web3 = Web3j.build(new HttpService("https://rinkeby.infura.io/v3xxxxxxxxxxxx872"));

        setupBouncyCastle();

        //  this is the pathname for the file that will be created and stores the wallet details
        EditText Edtpath = findViewById(R.id.walletpath);
        final String etheriumwalletPath = Edtpath.getText().toString();

        file = new File(getFilesDir() + etheriumwalletPath);// the etherium wallet location
        //create the directory if it does not exist
        if (!file.mkdirs() ) {
           file.mkdirs();
        }
        else {
            Toast.makeText(getApplicationContext(), "Directory already created",
                    Toast.LENGTH_LONG).show();

        }

    }

    public void connectToEthNetwork(View v) {

        ShowToast(" Now Connecting to Ethereum network");
        try {
            //if the client version has an error the user will not gain access if successful the user will get connnected
            Web3ClientVersion clientVersion = web3.web3ClientVersion().sendAsync().get();
            if (!clientVersion.hasError()) {
                ShowToast("Connected!");
            } else {
                ShowToast(clientVersion.getError().getMessage());
            }
        } catch (Exception e) {
            ShowToast(e.getMessage());
        }
    }


public void retrieveBalance (View v)  {
    //get wallet's balance

    try {
            EthGetBalance balanceWei = web3.ethGetBalance("0xe3f540731e27e2bb175580fbxxxxxxxx", DefaultBlockParameterName.LATEST).sendAsync()
                    .get();
        TextView txtbalance=findViewById(R.id.text_balance);
            txtbalance.setText(getString(R.string.your_balance) + balanceWei.getBalance());
        }
        catch (Exception e){
            ShowToast("balance failed");

        }
}

    public void createWallet(View v)  {

        EditText Edtpassword = findViewById(R.id.password);
        final String password = Edtpassword.getText().toString();  // this will be your etherium password
 try {
     // generating the etherium wallet
     Walletname = WalletUtils.generateLightNewWalletFile(password, file);
     ShowToast("Wallet generated wallet name is ");
     credentials = WalletUtils.loadCredentials(password, file + "/" + Walletname);
     txtaddress.setText(getString(R.string.your_address) + credentials.getAddress());

 }
 catch(Exception e){
     ShowToast("failed");

 }
        }


    public void makeTransaction(View v) throws Exception {
        // get the amout of eth value the user wants to send
        EditText Edtvalue = findViewById(R.id.ethvalue);
        int value  = Integer.parseInt(Edtvalue.getText().toString());
        try{

           TransactionReceipt receipt = Transfer.sendFunds(web3, credentials,"0x2a2 please enter yours b5e8af2fba85",BigDecimal.valueOf(value), Convert.Unit.ETHER).send();
           Toast.makeText(this, "Transaction successful: " +receipt.getTransactionHash(), Toast.LENGTH_LONG).show();
    }
    catch(Exception e){
        ShowToast("low balance");

    }
    }


    public void ShowToast(String message) {
        //this method generates toasts
        runOnUiThread(() -> {
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        });
    }

  //set up the security provider
    private void setupBouncyCastle() {
        final Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider == null) {
            // Web3j will set up a provider  when it's used for the first time.
            return;
        }
        if (provider.getClass().equals(BouncyCastleProvider.class)) {
            return;
        }
        //There is a possibility  the bouncy castle registered by android may not have all ciphers 
     //so we  substitute with the one bundled in the app.
        Security.removeProvider(BouncyCastleProvider.PROVIDER_NAME);
        Security.insertProviderAt(new BouncyCastleProvider(), 1);
    }

}
