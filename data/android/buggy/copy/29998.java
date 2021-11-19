@org.testng.annotations.Test(expectedExceptions = org.eclipse.golo.runtime.AmbiguousFunctionReferenceException.class)
public void test_fun_ambiguous() throws java.lang.Throwable {
    java.lang.Object overloaded = gololang.Predefined.fun("overloaded", gololang.PredefinedTest.MyCallable.class);
}