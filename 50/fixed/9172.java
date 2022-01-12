public hudson.model.Result run(hudson.model.BuildListener listener) throws java.lang.Exception {
    listener.getLogger().print(log);
    hudson.model.Result r = (result == 0) ? Result.SUCCESS : Result.FAILURE;
    return r;
}