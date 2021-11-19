private void thenLongestMatchIsFound(java.lang.String scenarioNameInCoverage, java.lang.String specFlowFileId, com.stevpet.sonar.plugins.dotnet.mscover.model.MethodIdModel specFlowMethodId) {
    java.lang.String gottenFile;
    gottenFile = map.getLongestContainedMethod(specFlowMethodId);
    assertEquals("FileId should be found", specFlowFileId, gottenFile);
    assertEquals("methodName resulting", scenarioNameInCoverage, specFlowMethodId.getMethodName());
}