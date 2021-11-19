public com.takahirom.android_abtest_builder.ABTest<T> buildIfFirstTime() {
    com.takahirom.android_abtest_builder.ABTest<T> builtInstance = com.takahirom.android_abtest_builder.ABTest.getBuiltInstance(context, clazz);
    if (builtInstance != null) {
        return builtInstance;
    }
    return build();
}