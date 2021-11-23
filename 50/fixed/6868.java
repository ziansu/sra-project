public dooyit.logic.Colour pickRandomColour() {
    if ((colourPool.size()) == 0) {
        colourPool = new java.util.ArrayList<dooyit.logic.Colour>(recommendedColour);
    }
    return colourPool.remove(random.nextInt(colourPool.size()));
}