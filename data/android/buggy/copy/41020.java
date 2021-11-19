@java.lang.Override
public com.fallingdutchman.youtuberedditbot.formatting.Formatter createFormatterFromFile(java.io.File file) throws java.io.IOException {
    final java.lang.String strings = com.fallingdutchman.youtuberedditbot.formatting.FileFormatterFactory.joinStrings(java.nio.file.Files.readAllLines(java.nio.file.Paths.get(file.toURI())));
    return new com.fallingdutchman.youtuberedditbot.formatting.Formatter(strings);
}