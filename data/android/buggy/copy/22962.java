@java.lang.Override
public void onPause() {
    getPresenter().putWishlist(wishlist);
    super.onPause();
}