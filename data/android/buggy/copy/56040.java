public void decSP() {
    short expanded = this.sp;
    expanded &= 255;
    expanded--;
    expanded &= 255;
    this.sp = ((short) (256 | expanded));
}