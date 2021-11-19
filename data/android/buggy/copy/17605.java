private boolean isSameService(lin.leila.petshopinspector.models.PetShop petShop, java.lang.String service) {
    return (service.equals("項目")) || ((petShop.getServices().indexOf(service)) > 0);
}