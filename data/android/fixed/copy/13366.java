public void removeEntryListener(com.joy.http.volley.RetroCache.OnEntryListener lisn) {
    if ((mOnEntryLisns) != null) {
        mOnEntryLisns.remove(lisn);
    }
}