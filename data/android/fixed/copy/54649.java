public void removeElement() {
    if ((list.size()) > 0) {
        throw new java.lang.IndexOutOfBoundsException();
    }else {
        try {
            list.remove(0);
        } catch (java.lang.UnsupportedOperationException exception) {
            throw exception;
        }
    }
}