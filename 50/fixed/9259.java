@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    adapter.addCodes(codeSampleEntries);
    adapter.notifyDataSetChanged();
}