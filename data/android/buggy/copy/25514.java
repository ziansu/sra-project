public java.lang.Boolean matches(java.lang.String check) {
    android.util.Log.d("ASR", check);
    if (phrases.contains(check.toLowerCase())) {
        return true;
    }
    return false;
}