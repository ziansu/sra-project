public static boolean convertSmileys(android.text.Editable input) {
    for (java.lang.String key : org.kontalk.util.MessageUtils.sEmojiConverterMap.keySet()) {
        if (org.kontalk.util.MessageUtils.replaceEditable(input, key, org.kontalk.util.MessageUtils.sEmojiConverterMap.get(key))) {
            return true;
        }
    }
    return false;
}