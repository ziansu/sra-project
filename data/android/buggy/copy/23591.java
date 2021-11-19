public static void notEqualsThen(java.lang.Object left, java.lang.Object right, com.highstreet.technologies.odl.app.spectrum.impl.primitive.Then then) {
    com.highstreet.technologies.odl.app.spectrum.impl.primitive.When.when(() -> left.equals(right), then);
}