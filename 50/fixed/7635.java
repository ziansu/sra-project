private java.lang.String getConfigXMLPathFromEnvironemnt() {
    java.lang.System.out.println(java.lang.System.getProperty(EnvKeys.CONFIG_XML_PATH_ENV_VAR));
    return java.lang.System.getProperty(EnvKeys.CONFIG_XML_PATH_ENV_VAR);
}