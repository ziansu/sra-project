public static boolean isValidEmail(java.lang.CharSequence target) {
    return (target != null) && (android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches());
}