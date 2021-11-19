public void setAdmin(int admin) {
    int oldAdmin = this.hallAdmin;
    this.hallAdmin = admin;
    firePropertyChange("admin", oldAdmin, this.hallAdmin);
}