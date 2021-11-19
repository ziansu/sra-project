private int getEndurance() {
    return (getStats().getEndurance()) + ((armour) == null ? 0 : armour.getStats().getHealth());
}