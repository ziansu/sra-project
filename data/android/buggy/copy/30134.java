public void setData(java.util.List<java.lang.String> datas) {
    mDataList = datas;
    mCurrentSelected = (datas.size()) / 2;
    invalidate();
}