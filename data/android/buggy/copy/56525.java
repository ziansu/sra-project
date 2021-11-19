public void setY(double y) {
    double temp = this.y;
    this.y = y;
    java.lang.System.out.println(("Moved " + (java.lang.Math.abs((temp - (this.y))))));
}