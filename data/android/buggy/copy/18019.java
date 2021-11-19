public java.util.List<Entitys.Product> getbasket() {
    java.lang.System.out.println("GETTING B ASKET LIST.");
    if ((basket) == null) {
        java.lang.System.out.println("it's null");
        basket = basketService.getBasketlist(user.getCustomer().getIdCustomer());
    }
    return basket;
}