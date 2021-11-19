public void removeRow(int rowIndex) {
    if ((rowIndex >= 0) && (rowIndex < (trackList.size()))) {
        trackList.removeTrackInfo(rowIndex);
        fireTableDataChanged();
    }
}