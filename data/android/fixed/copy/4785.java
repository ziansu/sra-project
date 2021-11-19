void scrollDownBy(int diff) {
    if (((endIdx) + diff) < ((items.size()) + 1)) {
        startIdx += diff;
        geo.updateRepaint();
    }
}