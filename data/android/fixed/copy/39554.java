public int bestOfBenisThreshold() {
    java.lang.String value = preferences.getString("pref_bestof_threshold", "2000");
    return com.google.common.base.MoreObjects.firstNonNull(com.google.common.primitives.Ints.tryParse(value), 0);
}