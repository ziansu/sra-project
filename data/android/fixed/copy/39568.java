public java.lang.String getSourceName(java.lang.String Default) {
    if ((this.source) == null)
        return Default;
    
    java.lang.String result = this.source.info.getName();
    if (result == null)
        return Default;
    
    return result;
}