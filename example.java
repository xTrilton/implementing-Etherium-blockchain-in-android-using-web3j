/**
* This method always returns immediately, whether or not the 
* image exists. When this applet attempts to draw the image on
* the screen, the data will be loaded. The graphics primitives 
* that draw the image will incrementally paint on the screen. 
* @param  url  an absolute URL giving the base location of the image
* @param  name the location of the image, relative to the url argument
* @return  the image at the specified URL
* @see Image
*/

/**
* This method always returns immediately, whether or not the 
* image exists. When this applet attempts to draw the image on
* the screen, the data will be loaded. The graphics primitives 
* that draw the image will incrementally paint on the screen. 
* @param  url  an absolute URL giving the base location of the image
* @param  name the location of the image, relative to the url argument
* @return  the image at the specified URL
* @see Image
*/

public Image getImage(URL url, String name) {
try {
return getImage(new URL(url, name));
} catch (MalformedURLException e) {
return null;
}
}
