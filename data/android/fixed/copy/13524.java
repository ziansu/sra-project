public double similarity(int aIndex, plusone.utils.PaperIF b) {
    java.util.Map<java.lang.Integer, java.lang.Double> aRepr = trainingRepresentations.get(aIndex);
    java.util.Map<java.lang.Integer, java.lang.Double> bRepr = represent(b);
    return sparseDot(aRepr, bRepr);
}