public boolean getIsPopped() {
    if (isPopped) {
        this.deleteObservers();
    }
    return isPopped;
}