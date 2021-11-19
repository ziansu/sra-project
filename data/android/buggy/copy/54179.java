public void PutStringPreferences(java.lang.String Name, java.lang.String Function) {
    settings = getSharedPreferences(Name, 1);
    editor = settings.edit();
    editor.putString(Name, Function);
    editor.commit();
}