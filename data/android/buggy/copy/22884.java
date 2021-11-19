public java.lang.String getString(Tribute victim) {
    java.lang.String s = event;
    java.lang.System.out.println(victim.getName());
    return s.replaceAll("_v1", victim.getName());
}