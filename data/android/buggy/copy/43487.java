public java.util.List<com.nekretnine.models.Advertisement> findBySoldto(com.nekretnine.models.Customer customer) {
    return repository.findBySoldto(customer);
}