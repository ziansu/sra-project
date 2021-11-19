private void removeNarjillo(org.nusco.narjillos.creature.Narjillo narjillo, org.nusco.narjillos.genomics.GenePool genePool) {
    notifyThingRemoved(narjillo);
    synchronized(narjillos) {
        narjillos.remove(narjillo);
    }
    genePool.remove(narjillo.getDNA());
}