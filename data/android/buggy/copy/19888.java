protected com.google.common.base.Predicate<java.lang.reflect.Method> getPredicate(org.eclipse.emf.ecore.EObject context, org.eclipse.emf.ecore.EClass type) {
    java.lang.String methodName = "scope_" + (type.getName());
    java.lang.System.out.println(methodName);
    return PolymorphicDispatcher.Predicates.forName(methodName, 2);
}