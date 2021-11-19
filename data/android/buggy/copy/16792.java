public java.lang.String actionVozidloAdd() {
    vozidlo.setOwner(osoba);
    osoba.getVozidla().add(vozidlo);
    return "add";
}