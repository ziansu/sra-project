@java.lang.Override
public java.lang.String getString(java.lang.String key) {
    java.lang.Object value = nsDictionary.get(convertKey(key));
    if (value == null)
        return "";
    
    return value.toString();
}