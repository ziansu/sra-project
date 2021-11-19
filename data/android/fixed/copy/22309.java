private void require(java.lang.String s) {
    if (!(peek().toString().equals(s)))
        throw makeException(s);
    
    next();
}