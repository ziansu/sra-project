private boolean contains(java.util.List<fr.imag.entities.OrderLine> list, int idProduct) {
    for (fr.imag.entities.OrderLine order : list) {
        if (idProduct == (order.getIdProduct())) {
            return true;
        }
    }
    return false;
}