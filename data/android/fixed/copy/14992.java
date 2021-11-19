public java.lang.String getNext() {
    if ((line = new java.lang.String(it.next().message())) != null) {
        return line;
    }else {
        return null;
    }
}