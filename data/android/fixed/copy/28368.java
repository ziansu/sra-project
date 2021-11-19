@java.lang.Override
public boolean isRunning(boolean checkFiles) throws java.lang.Exception {
    if ((channel) != null)
        return channel.isConnected();
    
    return super.isRunning(checkFiles);
}