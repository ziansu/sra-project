public static double[] toPrimitives(java.util.List<java.lang.Double> values) {
    return values.stream().mapToDouble(java.lang.Double::doubleValue).toArray();
}