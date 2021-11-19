public synchronized void set(java.lang.String name, java.lang.String value) {
    name = org.zoxweb.shared.util.SharedStringUtil.toLowerCase(name);
    properties.put(name, value);
}