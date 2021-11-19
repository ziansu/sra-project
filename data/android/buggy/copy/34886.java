@org.jetbrains.kotlin.test.TestMetadata(value = "throwableImpl.kt")
public void testThrowableImpl() throws java.lang.Exception {
    java.lang.String fileName = org.jetbrains.kotlin.test.KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/specialBuiltins/throwableImpl.kt");
    try {
        doTest(fileName);
    } catch (java.lang.Throwable ignore) {
        return ;
    }
    throw new java.lang.AssertionError("Looks like this test can be unmuted. Remove IGNORE_BACKEND directive for that.");
}