@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... voids) {
    weakLoginManager.get().trySignInAutomatically();
    return null;
}