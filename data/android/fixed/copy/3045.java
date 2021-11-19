private void savePref(java.lang.String key, long value) {
    me.wizos.loread.data.WithSet.editor.putLong(key, value);
    me.wizos.loread.data.WithSet.editor.apply();
}