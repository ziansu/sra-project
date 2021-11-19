public void removeItinerary(long id) {
    mItineraryDb.delete(ItineraryListContract.ItineraryListEntry.TABLE_NAME, (((ItineraryListContract.ItineraryListEntry._ID) + "=") + id), null);
}