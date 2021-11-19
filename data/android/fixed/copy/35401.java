public void setDefaultScriptNames(java.lang.String scriptNames) {
    if (!(scriptNames.trim().isEmpty()))
        service.setDefaultScripts(java.util.Arrays.asList(scriptNames.split(",")));
    
}