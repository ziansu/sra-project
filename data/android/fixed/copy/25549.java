public boolean play() {
    if (canPlay()) {
        Woo.changeDirection();
        return true;
    }else {
        return false;
    }
}