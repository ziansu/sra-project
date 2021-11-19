private static boolean isElement(java.lang.reflect.Field field) {
    java.util.List<java.lang.Class<?>> interfaces = java.util.Arrays.asList(field.getType().getInterfaces());
    return interfaces.contains(io.magentys.screens.annotations.ScreenElement.class);
}