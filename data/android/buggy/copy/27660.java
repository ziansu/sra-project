private java.lang.String mediaFull() {
    if ((task().getMedia()) == null)
        return "";
    
    return task().getMedia().name();
}