public org.m2latex.mojo.Settings setMaxNumReruns(int maxNumReruns) {
    assert maxNumReruns >= (-1);
    this.maxNumReruns = maxNumReruns;
    return this;
}