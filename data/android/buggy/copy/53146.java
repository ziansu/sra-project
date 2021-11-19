public void updateTitle() {
    com.ddiehl.reddit.listings.Link link = mLinkCommentsPresenter.getLinkContext();
    if (link != null) {
        mMainView.setTitle(link.getTitle());
    }else {
        mMainView.setTitle(getString(R.string.comments_fragment_title));
    }
}