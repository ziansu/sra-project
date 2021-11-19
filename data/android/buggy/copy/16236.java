private void initData() {
    openDataBase();
    if (isThereHaveUrlDataInDB()) {
        java.lang.String data = getUrlDataFromDB();
        initFragment(data);
        getUrlDataFromNetFlow();
    }else {
        getUrlDataFromNetFlow();
    }
}