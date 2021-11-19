private void saveFragment() {
    context.getSharedPreferences(VideoActivity.PREFERENCE, this.context.MODE_PRIVATE).edit().putBoolean(com.example.disney.myapplication.VideoAdapter.key, true).commit();
}