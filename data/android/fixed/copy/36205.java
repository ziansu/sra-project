public boolean itemFits(de.jtheb.fh.lagerverwaltung.entities.Item item) {
    if (!(isFull())) {
        for (de.jtheb.fh.lagerverwaltung.entities.Shelf shelf : shelves) {
            if (shelf.itemFits(item)) {
                return true;
            }
        }
    }
    return false;
}