public void UnLoadMod() {
    synchronized(com.peculiargames.andmodplug.PlayerThread.sRDlock) {
        com.peculiargames.andmodplug.PlayerThread.ModPlug_JUnload();
    }
}