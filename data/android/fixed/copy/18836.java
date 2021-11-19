@org.kohsuke.stapler.export.Exported
public float getPercentageFloat() {
    float numerator = covered;
    float denominator = (missed) + (covered);
    return denominator <= 0 ? 100 : 100 * (numerator / denominator);
}