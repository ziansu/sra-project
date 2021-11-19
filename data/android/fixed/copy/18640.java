public boolean match(java.lang.CharSequence constraint) {
    return title.toLowerCase(java.util.Locale.US).contains(constraint.toString().toLowerCase(java.util.Locale.US));
}