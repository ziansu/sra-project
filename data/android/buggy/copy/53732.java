private static void parseDropinsFilesVariables(java.io.File file) throws java.lang.Exception {
    org.w3c.dom.Document doc = net.wasdev.wlp.gradle.plugins.utils.ServerConfigDocument.parseDocument(new java.io.FileInputStream(file));
    net.wasdev.wlp.gradle.plugins.utils.ServerConfigDocument.parseVariables(doc);
    net.wasdev.wlp.gradle.plugins.utils.ServerConfigDocument.parseIncludeVariables(doc);
}