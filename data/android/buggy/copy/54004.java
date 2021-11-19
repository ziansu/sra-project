public java.net.URL next() {
    if (hasNext()) {
        (myCurrentIndex)++;
        return myHistory.get(myCurrentIndex);
    }
    return null;
}