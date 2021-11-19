public void isFavCallBack() {
    if (mControl.getModel().ismIsFav()) {
        mTitleBar.findViewById(R.id.fav).setActivated(true);
        mTitleBar.findViewById(R.id.fav).setOnClickListener(null);
    }
}