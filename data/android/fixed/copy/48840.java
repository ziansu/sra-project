public java.lang.String removeDiacritical(java.lang.String text) {
    return text == null ? null : java.text.Normalizer.normalize(text, java.text.Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
}