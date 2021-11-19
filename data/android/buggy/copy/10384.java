public java.lang.String next() {
    if (hasNext()) {
        (element)++;
        return supa.get(element);
    }else {
        throw new java.util.NoSuchElementException();
    }
}