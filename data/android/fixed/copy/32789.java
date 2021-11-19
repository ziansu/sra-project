@java.lang.Override
protected void configDataManager(com.kimeeo.kAndroid.listViews.dataProvider.DataProvider dataManager) {
    if (((getHeaderObject()) != null) && (dataManager != null)) {
        dataManager.add(0, getHeaderObject());
        dataManager.setRefreshItemPos(1);
    }
}