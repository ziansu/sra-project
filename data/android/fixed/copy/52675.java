public void createProduct() {
    product.setAuctionUser(auctionUserView.getAuctionUser());
    productFacade.create(product);
    auctionUserView.update();
}