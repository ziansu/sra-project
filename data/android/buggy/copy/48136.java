public fr.umlv.unitex.graphrendering.GenericGraphBox prevBox() {
    currentIndex = floorMod(((currentIndex) - 1), boxes.size());
    return boxes.get(currentIndex);
}