private static int getItemAddedHealth(java.lang.String item) {
    return item.contains(", ") ? java.lang.Integer.parseInt(com.google.common.base.CharMatcher.digit().retainFrom(terrails.terracore.helper.StringHelper.getSubstringAfter(item, ","))) : 2;
}