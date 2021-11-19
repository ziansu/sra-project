public void addCustomer(java.lang.String name) {
    try {
        java.lang.System.out.println(customerList.addCustomer(new Customer(name)));
    } catch (ShoppingCenterException e) {
        java.lang.System.out.println(e.getMessage());
    }
}