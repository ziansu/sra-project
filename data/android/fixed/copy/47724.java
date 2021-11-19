@org.testng.annotations.Test(expectedExceptions = java.lang.IllegalArgumentException.class)
public void testDoubleZScoreFailInvalid() {
    com.linkedin.thirdeye.dataframe.DataFrame.toSeries(1.5, 1.5, 1.5).zscore();
}