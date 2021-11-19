public void addToBasket(com.qac.row5project.entities.Stock id) {
    if (currentUser.isLoggedIn())
        basketService.addToBasket(currentUser.getCustomer().getID(), id, 0);
    
}