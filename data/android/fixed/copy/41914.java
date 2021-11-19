public void replaceDataList(java.util.List<com.mredrock.cyxbs.model.lost.Lost> dataList) {
    mList.clear();
    if (dataList != null) {
        mList.addAll(dataList);
    }
    notifyDataSetChanged();
}