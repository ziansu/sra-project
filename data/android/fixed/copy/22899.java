public void setSuperSelected(int superSelected) {
    this.currentSelected = java.lang.Math.min(java.lang.Math.max(superSelected, 0), ((this.menuItems.size()) - 1));
}