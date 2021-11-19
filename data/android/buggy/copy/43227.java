private java.lang.String apiKey() {
    java.lang.String envKey = java.lang.System.getenv("HONEYBADGER_API_KEY");
    if (envKey != null)
        return envKey;
    
    return java.lang.System.getProperty(io.honeybadger.reporter.HONEYBADGER_API_KEY_SYS_PROP_KEY);
}