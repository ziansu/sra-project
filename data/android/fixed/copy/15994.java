public void reportErrors(com.jetbrains.jetpad.vclang.typechecking.error.reporter.ErrorReporter errorReporter) {
    if (myUnsolvedVariables.isEmpty()) {
        myEquations.reportErrors(errorReporter);
    }
    for (com.jetbrains.jetpad.vclang.term.context.binding.InferenceBinding unsolvedVariable : myUnsolvedVariables) {
        unsolvedVariable.reportErrorInfer(errorReporter);
    }
}