public void setNum(int num) {
    this.num = num;
    if (num <= 0) {
        label.setText("");
    }else {
        label.setText((num + ""));
    }
}