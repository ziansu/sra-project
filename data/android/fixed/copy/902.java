public void setAddress(homework2.Address address) {
    if (address == null)
        this.address = new homework2.Address("Anonymous", 0, 0);
    else
        this.address = address;
    
}