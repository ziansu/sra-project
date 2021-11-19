public void setMaxVisableItemNum(int maxItemNum) {
    if ((maxItemNum % 2) == 0) {
        throw new java.lang.IllegalArgumentException("maxItemNum should be a odd number");
    }else {
        com.fidroid.centerscaledrecycelerview.CenterScaledRecyclerView.THIRD = maxItemNum;
    }
}