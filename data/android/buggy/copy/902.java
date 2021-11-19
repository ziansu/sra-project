public void setAddress(homework2.Address address) {
    if (address.equals(""))
        this.address = new homework2.Address("Anonymous", 0, 0);
    else
        this.address = address;
    
}