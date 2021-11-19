public void chooseDataBase(int dbIndex) {
    if ((mDataInternet) != null) {
        dbId = mDataInternet.get(dbIndex).getId();
    }
}