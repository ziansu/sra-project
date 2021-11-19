private void handleSupersetRelation(TrackingRow newEntry, java.util.ListIterator<TrackingRow> listIterator, TrackingRow tableEntry) {
    tableEntry.deleted = true;
    listIterator.add(newEntry);
}