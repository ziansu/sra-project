public void remove(contract.IAffichable object) {
    this.al.remove(object);
    object.set_hidden(true);
}