public boolean match(java.lang.CharSequence constraint) {
    return title.toLowerCase(java.util.Locale.US).startsWith(constraint.toString().toLowerCase(java.util.Locale.US));
}