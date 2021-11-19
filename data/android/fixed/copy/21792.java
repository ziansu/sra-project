private boolean isValidEmail(java.lang.CharSequence target) {
    return (!(android.text.TextUtils.isEmpty(target))) && (android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches());
}