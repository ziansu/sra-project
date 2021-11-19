private java.lang.String getConfFile() {
    if (fileExists())
        return fr.inria.soctrace.lib.utils.Configuration.ConfFilePath;
    
    return ((((java.lang.System.getProperty("user.home")) + (java.io.File.separator)) + (fr.inria.soctrace.lib.utils.Configuration.CONF_DIR)) + (java.io.File.separator)) + (fr.inria.soctrace.lib.utils.Configuration.CONF_FILE_NAME);
}