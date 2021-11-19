@java.lang.Override
protected void onPostExecute(java.lang.Boolean result) {
    if (null != (com.tsungweiho.intelligentpowersaving.MainActivity.getContext()))
        ((com.tsungweiho.intelligentpowersaving.MainActivity) (com.tsungweiho.intelligentpowersaving.MainActivity.getContext())).setIfShowErrorMessage(result);
    
}