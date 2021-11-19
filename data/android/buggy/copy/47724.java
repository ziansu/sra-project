@org.testng.annotations.Test
public void testDoubleZScoreFailInvalid() {
    com.linkedin.thirdeye.dataframe.DoubleSeries s = com.linkedin.thirdeye.dataframe.DataFrame.toSeries(1.5, 1.5, 1.5).zscore();
    com.linkedin.thirdeye.dataframe.DataFrameTest.assertEquals(s, com.linkedin.thirdeye.dataframe.DoubleSeries.nulls(3));
}