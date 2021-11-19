private void jBtnNextActionPerformed(java.awt.event.ActionEvent evt) {
    Interfaces.ListHouse house = ((Interfaces.ListHouse) (Interfaces.RealEstate.list.getNextItem(true)));
    showHouse(house);
}