public boolean isIn() {
    if ((isIn) != null) {
        return isIn;
    }else {
        return parent.isExists();
    }
}