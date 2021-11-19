private com.noname.digital.model.Customer getCustomer(java.lang.Long id) {
    com.noname.digital.model.Customer customer = this.customerRepository.findOne(id);
    com.google.common.base.Preconditions.checkNotNull(customer, ("No customer found for id=" + id));
    return customer;
}