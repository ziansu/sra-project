private java.lang.String getMuleHomeEnvVarOrSystemProperty() {
    java.lang.String muleHome = java.lang.System.getenv("MULE_HOME");
    if (muleHome == null) {
        muleHome = java.lang.System.getProperty("mule.home");
    }
    return muleHome;
}