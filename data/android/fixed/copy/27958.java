private java.lang.CharSequence generateChoiceNotPresentCondition(final int sinceVersion, final java.lang.String indent) {
    if (0 == sinceVersion) {
        return "";
    }
    return java.lang.String.format((((indent + "        if self.actingVersion_ < %1$d:\n") + indent) + "            return False\n\n"), sinceVersion);
}