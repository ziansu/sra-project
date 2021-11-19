public void addMasterList(java.lang.String value) {
    if (!(masterList.contains(value))) {
        if (value.contains("Treffer1")) {
            android.util.Log.d("testitest", "treffer1");
        }
        masterList.add(value);
    }
}