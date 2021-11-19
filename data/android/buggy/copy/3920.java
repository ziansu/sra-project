protected boolean externalStorageEnvironmentReady() {
    java.io.File path = getFileDir(com.asksven.commandcenter.valueobjects.CommandsIO.m_ctx);
    return path.exists();
}