public void setNum(int num) {
    this.num = num;
    label.setText((num + ""));
    if (num == 0) {
        label.setText("");
    }
}