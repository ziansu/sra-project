@java.lang.Override
public void execute() throws java.lang.Exception {
    flushVdcConfigToLocal();
    flushNtpConfigToLocal();
    checkDataRevision();
}