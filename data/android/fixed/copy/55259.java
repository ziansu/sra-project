public void internal(java.lang.String message) {
    if (com.fireball1725.firecore.common.util.Platform.isDevEnv())
        log(Level.INFO, message);
    
}