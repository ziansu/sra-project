@java.lang.Override
public boolean removeItem(iitema.gypsypokemon.elements.Direction dir) {
    if (super.removeItem(iitema.gypsypokemon.elements.Direction)) {
        this.door.close();
        return true;
    }
    return false;
}