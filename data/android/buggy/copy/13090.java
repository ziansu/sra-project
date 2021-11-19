public rx.Observable<com.insuranceline.data.vo.DailySummary> getDailySummaryFromDb() {
    timber.log.Timber.d("getDailySummaryFromDb");
    return mDatabaseHelper.getDailySummaryObservable();
}