private static boolean isFloatingPointNumber(java.lang.Number number) {
    java.lang.Class<?> numberClass = number.getClass();
    return (java.lang.Float.class.isAssignableFrom(numberClass)) || (java.lang.Double.class.isAssignableFrom(numberClass));
}