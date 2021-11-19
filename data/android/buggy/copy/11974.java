public static void registerNative(java.lang.String name, int addr) {
    java.lang.System.out.println(name);
    Loader.natives.put(name, addr);
}