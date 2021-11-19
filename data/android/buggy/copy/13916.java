public boolean value(final com.intellij.execution.junit.PsiMethod method) {
    return (framework) != null ? framework.isTestMethod(method) : com.intellij.execution.junit.JUnitUtil.isTestMethod(com.intellij.execution.junit2.info.MethodLocation.elementInClass(method, myClass));
}