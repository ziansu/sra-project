private itu.mmad.dttn.tingle.Model.Thing searchById(int id) {
    for (itu.mmad.dttn.tingle.Model.Thing t : thingsDB) {
        if ((t.getId().hashCode()) == id) {
            return t;
        }
    }
    return null;
}