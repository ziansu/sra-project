@java.lang.Override
public boolean placeOn(iitema.gypsypokemon.elements.Direction dir, iitema.gypsypokemon.elements.blocks.ItemInterface item) {
    if (super.placeOn(dir, item)) {
        this.door.open();
        return true;
    }
    return false;
}