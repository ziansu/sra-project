@org.jbehave.core.annotations.Then(value = "the compilation unit has 2 imports")
public void thenTheCompilationUnitHas2Imports(java.lang.String nameUnderTest) {
    com.github.javaparser.ast.CompilationUnit cu = ((com.github.javaparser.ast.CompilationUnit) (state.get("cuBuilder")));
    org.hamcrest.MatcherAssert.assertThat(cu.getImports().size(), org.hamcrest.CoreMatchers.is(2));
}