public void validateRecursively(java.lang.String packageName, com.openpojo.reflection.PojoClassFilter... filters) {
    com.openpojo.reflection.PojoClassFilter pojoClassFilter = new com.openpojo.reflection.filters.FilterChain(filters);
    java.util.List<com.openpojo.reflection.PojoClass> pojoClasses = com.openpojo.reflection.impl.PojoClassFactory.getPojoClassesRecursively(packageName, pojoClassFilter);
    validate(pojoClasses);
}