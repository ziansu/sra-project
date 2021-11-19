public void addToCart(javafx.event.ActionEvent evt) {
    this.changeListner.firePropertyChange("nytt", null, theProduct);
    se.chalmers.ait.dat215.project.IMatDataHandler.getInstance().addProduct(theProduct);
    this.changeListner.firePropertyChange("Nytt", null, theProduct);
}