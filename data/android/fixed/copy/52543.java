public boolean isIn() {
    if ((isIn) != null) {
        return isIn;
    }else
        if ((parent) != null) {
            return parent.isIn();
        }else {
            return false;
        }
    
}