public void setCustomer(com.y4d3.domain.Customer customer) {
    this.customer = customer;
    customer.setUser(this);
}