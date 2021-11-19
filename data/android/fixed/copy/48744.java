public static int getIntValue(backtype.storm.Config stormConf, java.lang.String key, int defaultValue) {
    java.lang.Object config = stormConf.get(key);
    if (config == null) {
        return defaultValue;
    }
    return java.lang.Integer.parseInt(config.toString());
}