void scrollDownBy(int diff) {
    if (((endIdx) + diff) != (items.size())) {
        startIdx += diff;
        geo.updateRepaint();
    }
}