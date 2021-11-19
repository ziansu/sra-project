public void appendToConsoleLog(com.thoughtworks.go.domain.JobIdentifier jobIdentifier, java.lang.String text) throws com.thoughtworks.go.domain.exception.IllegalArtifactLocationException, java.io.IOException {
    java.io.File file = findConsoleArtifact(jobIdentifier);
    updateConsoleLog(file, new java.io.ByteArrayInputStream(text.getBytes()), com.thoughtworks.go.server.service.ConsoleService.LineListener.NO_OP_LINE_LISTENER);
}