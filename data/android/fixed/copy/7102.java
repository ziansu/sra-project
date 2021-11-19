@java.lang.Override
public java.util.concurrent.Future<java.io.File> _submit(com.google.gson.JsonObject submission) throws java.lang.Exception {
    final java.io.File toolkitRoot = super._submit(submission).get();
    return createCodeArchive(toolkitRoot, submission);
}