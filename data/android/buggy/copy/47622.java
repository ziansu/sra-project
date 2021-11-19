public void offsetBelly(double amount) {
    belly += amount;
    if ((belly) < 0) {
        belly = 0;
    }
    lblBelly.setText((("Belly: " + (belly)) + "%"));
}