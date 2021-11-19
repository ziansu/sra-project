private void chooseIdentity() {
    isBuyer = (java.lang.Math.random()) >= 0.5;
    if (isBuyer) {
        Buyer b = new Buyer();
        myInfo = Buyer;
    }else
        myInfo = new Seller();
    
}