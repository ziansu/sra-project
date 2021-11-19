@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void test_NumberDefiningPeriodicity() {
    model.PeriodicTransaction periodTransaction = new model.PeriodicTransaction(date, (-1254), "HEBDOMADAIRE");
}