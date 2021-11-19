public fr.umlv.unitex.graphrendering.GenericGraphBox prevBox() {
    if ((currentIndex) == 1) {
        return null;
    }
    currentIndex = floorMod(((currentIndex) - 1), boxes.size());
    return boxes.get(currentIndex);
}