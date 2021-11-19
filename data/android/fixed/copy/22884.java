public java.lang.String getString(Tribute victim) {
    java.lang.String s = event;
    return s.replaceAll("_v1", victim.getName());
}