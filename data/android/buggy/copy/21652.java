public static void main(java.lang.String[] args) {
    com.github.javalbert.reflection.ClassAccess<com.github.javalbert.reflection.test.Foo> access = com.github.javalbert.reflection.ClassAccessFactory.get(com.github.javalbert.reflection.test.Foo.class);
    java.lang.System.out.println(access.propertyIndex("boxedLong"));
}