private com.bigcustard.blurp.bootstrap.BlurpRunnable createScriptRunnable(java.lang.String language, java.lang.String scriptName) {
    try {
        return new com.bigcustard.blurp.bootstrap.ScriptEngineBlurpRunnable(language, new java.io.FileReader(scriptName), scriptName);
    } catch (java.io.FileNotFoundException e) {
        throw new com.bigcustard.blurp.bootstrap.BlurpException(("Error loading script file " + scriptName));
    }
}