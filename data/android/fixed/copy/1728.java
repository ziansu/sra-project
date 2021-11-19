public void setSingles(java.lang.Integer singles) {
    this.singles = singles;
    this.currentHives = ((this.currentHives) == null) ? 0 : (this.singles) + (this.doubles);
}