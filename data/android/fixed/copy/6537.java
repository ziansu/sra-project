public void setTime(int count) {
    if (count < 0) {
        lblTimer.setText("");
    }else {
        lblTimer.setText(("" + count));
    }
}