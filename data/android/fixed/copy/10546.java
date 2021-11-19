public void isFavCallBack() {
    if (mControl.getModel().ismIsFav()) {
        mTitleBar.findViewById(R.id.fav).setActivated(true);
    }else {
        mTitleBar.findViewById(R.id.fav).setActivated(false);
    }
}