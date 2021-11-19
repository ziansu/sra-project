@java.lang.Override
public void onBackStackChanged() {
    if (mSelectedFragment.equals(com.nanodegree.gaby.bakerylovers.activities.ReviewOrderActivity.TAG_FRAGMENT_CONFIRM_ORDER)) {
        mSelectedFragment = com.nanodegree.gaby.bakerylovers.activities.ReviewOrderActivity.TAG_FRAGMENT_REVIEW_ORDER;
    }else {
        mSelectedFragment = com.nanodegree.gaby.bakerylovers.activities.ReviewOrderActivity.TAG_FRAGMENT_CONFIRM_ORDER;
    }
}