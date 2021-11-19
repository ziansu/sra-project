@java.lang.Override
public void onRightCardExit(java.lang.Object dataObject) {
    if (dataObject instanceof com.hoppingeagle.snapbuyer.Auction) {
        com.hoppingeagle.snapbuyer.Auction auction = ((com.hoppingeagle.snapbuyer.Auction) (dataObject));
        mCategoryBean.like(auction);
    }
}