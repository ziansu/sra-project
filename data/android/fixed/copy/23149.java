public void setAbsolutePathByString(java.lang.String pathString, java.lang.String prefix) {
    this.prefix = prefix;
    if (prefix != null)
        setPathByString(pathString.substring(prefix.length(), pathString.length()));
    else
        setPathByString(pathString);
    
}