private void stopLoader() {
    bindUserData(com.fiuba.tdp.linkup.services.UserManager.getInstance().getUserSelected());
    loader.setVisibility(View.GONE);
    loader.clearAnimation();
    findViewById(R.id.appbar).setVisibility(View.VISIBLE);
    nestedScrollView.setVisibility(View.VISIBLE);
}