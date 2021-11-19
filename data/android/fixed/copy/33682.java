public model.Kommentar getNewKommentar() {
    if ((newKommentar) == null) {
        newKommentar = new model.Kommentar();
    }
    return newKommentar;
}