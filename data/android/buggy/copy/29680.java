@java.lang.Override
protected void generate() {
    super.generate();
    bitmap(bitmap, premultiplied);
    super.filter(fModeMin, fModeMax);
    super.wrap(wModeH, wModeV);
}