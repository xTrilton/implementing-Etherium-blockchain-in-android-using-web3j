When someone creates a new Java class, request changes if the class doesn't meet JavaDoc requirements

Conditions (all must be true):

The PR creates a new Java class.
{{ is.java and is.new | some }} 
The PR lacks Javadoc content. Use this regex: to detect:
\/\*\*[\s\S]*?@param[\s\S]*?@return[\s\S]*?\*\/
