public java.lang.String next() {
    if (hasNext()) {
        (element)++;
        return supa.get(((element) - 1));
    }else {
        throw new java.util.NoSuchElementException();
    }
}