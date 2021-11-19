@java.lang.Override
public void smooth(int antialias) {
    this.quality = antialias;
    if (antialias == 0) {
        noSmooth();
    }else {
        smooth();
    }
}