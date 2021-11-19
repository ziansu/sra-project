public void hideShoppingBag() {
    mainLayout.setRight(null);
    if ((productViewController) != null) {
        productViewController.refresh();
    }
}