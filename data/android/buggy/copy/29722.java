public java.lang.String writeExecute() {
    if (save2Disk()) {
        return executionResult();
    }
    return "error saving file";
}