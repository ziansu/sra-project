@java.lang.Override
public java.util.concurrent.Future<java.io.File> _submit(com.google.gson.JsonObject submission) throws java.lang.Exception {
    preSubmit(submission);
    java.io.File toolkitRoot = super.submit(submission).get();
    return postSubmit(submission, com.ibm.streamsx.topology.internal.context.remote.ZippedToolkitRemoteContext.createCodeArchive(toolkitRoot, submission));
}