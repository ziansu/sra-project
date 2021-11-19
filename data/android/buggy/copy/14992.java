public java.lang.String getNext() {
    if (it.hasNext()) {
        return new java.lang.String(it.next().message());
    }else {
        return null;
    }
}