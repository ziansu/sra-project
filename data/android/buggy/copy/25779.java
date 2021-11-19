protected void configure() {
    bind(java.lang.String[].class).toInstance(strings);
    bind(new com.google.inject.TypeLiteral<java.lang.Integer[]>() {    }).toInstance(integers);
}