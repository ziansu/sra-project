public void addRandomArticle() {
    android.util.Log.e(moizest89.geronimostudios.test.ui.main.MainPresenter.TAG, ("mData: " + (mData)));
    getMvpView().setRandomArticle(this.mData.get(1));
}