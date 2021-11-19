public void serve(Customer c) {
    this.currCustomer = c;
    c.serve(this, this.serviceTime());
}