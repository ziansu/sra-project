public void clearList() {
    if ((mResultList) != null) {
        mResultList.clear();
    }
    notifyDataSetChanged();
}