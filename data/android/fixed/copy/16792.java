public java.lang.String actionVozidloAdd() {
    if (!(update)) {
        vozidlo.setOwner(osoba);
        osoba.getVozidla().add(vozidlo);
    }
    return "add";
}