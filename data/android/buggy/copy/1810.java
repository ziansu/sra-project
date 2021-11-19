@org.junit.Test
public void testBug334499_03() throws java.lang.Exception {
    org.eclipse.xtend.core.xtend.XtendClass clazz = clazz("class C { def void m() { foo('',5) }}");
    helper.assertError(clazz, XbasePackage.Literals.XFEATURE_CALL, org.eclipse.xtend.core.validation.IssueCodes.FEATURECALL_LINKING_DIAGNOSTIC, "foo(String, int) is", "for the type C");
}