@java.lang.Override
public java.lang.String clean(java.lang.String str) {
    if (str == null) {
        return str;
    }
    return java.text.Normalizer.normalize(str, java.text.Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
}