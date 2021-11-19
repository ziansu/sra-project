public java.lang.String getTargetName(java.lang.String Default) {
    if ((this.target) == null)
        return Default;
    
    return this.target.info.getName();
}