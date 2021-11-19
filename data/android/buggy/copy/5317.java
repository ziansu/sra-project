public void flush(@android.support.annotation.Nullable
com.google.android.sambadocumentsprovider.SambaConfiguration.OnConfigurationChangedListener listener) {
    new com.google.android.sambadocumentsprovider.SambaConfiguration.FlushTask(listener).execute();
}