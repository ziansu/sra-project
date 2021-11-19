public void setModDefesa(int armadura) {
    this.modDefesa = java.lang.Math.max(100, (armadura + (this.modAtaque)));
}