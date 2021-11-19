@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    ((com.tsungweiho.intelligentpowersaving.MainActivity) (com.tsungweiho.intelligentpowersaving.MainActivity.getContext())).setIfShowErrorMessage(result);
}