public binnie.core.genetics.BreedingSystem getSystem(forestry.api.genetics.ISpeciesRoot root) {
    if (root == null) {
        return null;
    }
    return getSystem(root.getUID());
}