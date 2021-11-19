public static synchronized cec.run.CECExecutor getInstance() {
    if ((cec.run.CECExecutor.singleton) == null) {
        cec.run.CECExecutor.singleton = new cec.run.CECExecutor();
    }
    return cec.run.CECExecutor.singleton;
}