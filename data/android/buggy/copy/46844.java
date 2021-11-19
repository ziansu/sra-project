public void itemClicked() {
    fragmentNavigator.navigateTo(fragmentProvider.newStoreFragment(getPojo().getReview().getUser().getId(), "DEFAULT", StoreFragment.OpenType.GetHome));
}