@java.lang.Override
public boolean removeItem(iitema.gypsypokemon.elements.Direction dir) {
    if (this.openSides.get(dir)) {
        return super.removeItem;
    }
    return false;
}