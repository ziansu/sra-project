public void setC(int c) {
    this.c = c;
    if ((this.c) < 0) {
        this.computeExactValueFunction = true;
    }else {
        this.computeExactValueFunction = false;
    }
}