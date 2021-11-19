public int getHashWert() {
    return (this.getSource().hashCode()) * (this.getTarget().hashCode());
}