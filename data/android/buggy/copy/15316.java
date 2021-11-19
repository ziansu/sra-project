public void showCart() {
    imat.viewcontroller.CartListViewController cartListViewController = new imat.viewcontroller.CartListViewController().load("CartListView.fxml");
    cartListViewController.showCart();
    showPane.getChildren().add(cartListViewController.getView());
}