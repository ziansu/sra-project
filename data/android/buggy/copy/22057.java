public java.lang.String getProperty(java.lang.String key) {
    java.lang.String value = configProp.getProperty(key);
    java.lang.System.out.println(((("Key : " + key) + " -- Value :") + value));
    return value;
}