protected boolean externalStorageEnvironmentReady() {
    java.io.File path = getFileDir(com.asksven.commandcenter.valueobjects.CommandsIO.m_ctx);
    if (path != null) {
        return path.exists();
    }else {
        return false;
    }
}