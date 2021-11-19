@java.lang.SuppressWarnings(value = "deprecation")
@org.junit.Test
@org.junit.Ignore
public void testDownloadStockData() {
    scheduledTask.downloadDailyData();
    scheduledTask.getWeeklyFromDailyForCurrentWeek();
    scheduledTask.calculateAndSaveMACrossForAllStocksUsingWeeklyData();
}