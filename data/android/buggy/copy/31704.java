@java.lang.Override
public synchronized boolean shootAt(iitema.gypsypokemon.model.Color color, iitema.gypsypokemon.model.Direction dir) {
    for (iitema.gypsypokemon.model.ItemInterface item : items) {
        if (item.solid(dir)) {
            return true;
        }
    }
    return false;
}