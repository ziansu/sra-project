@java.lang.Override
public synchronized void modifyLandValue(double factor) {
    this.landValue += factor;
    this.landValue = edu.mscd.thesis.util.Util.boundValue(this.landValue, this.baseLandValue(), Rules.MAX);
}