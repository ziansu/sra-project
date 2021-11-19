private com.airamerica.customer.Customer findCustomer(java.lang.String customerCode) {
    for (com.airamerica.customer.Customer c : customers) {
        if (c.getCode().equals(customerCode)) {
            return c;
        }
    }
    return null;
}