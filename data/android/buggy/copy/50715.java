private void saveAppData() {
    getSharedPreferences("appdata", Context.MODE_MULTI_PROCESS).edit().putString("projects", projects.toString());
}