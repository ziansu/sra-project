public static void load() {
    try (java.io.FileInputStream fis = new java.io.FileInputStream(jloda.util.ProgramProperties.getDefaultFileName())) {
        jloda.util.ProgramProperties.props.load(fis);
    } catch (java.lang.Exception ex) {
    }
}