@org.junit.Test
public void getCompiledHtml() {
    io.mockify.hoster.usecase.Project project = getProject();
    org.junit.Assert.assertEquals(projectCompilerUseCase.execute(project), testHtmlFileData);
}