private void log(java.lang.String message) {
    final javax.annotation.processing.Messager messager = processingEnv.getMessager();
    messager.printMessage(javax.tools.Diagnostic.Kind.ERROR, message);
}