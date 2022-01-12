public static codeu.chat.util.Uuid parse(java.lang.String string) throws java.io.IOException {
    return codeu.chat.util.Uuid.parse(null, string.split("\\."), 0);
}