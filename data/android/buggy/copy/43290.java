@java.lang.Override
public void run() {
    int totalAnswered = analyticsData.pieCorrectAndTotalValues[1];
    if (totalAnswered > 0) {
        displayAnalytics(analyticsData);
    }else {
        showNoAnalytics();
    }
}