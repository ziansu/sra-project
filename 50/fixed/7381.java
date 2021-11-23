public boolean isSpinning() {
    return ((dockerEnvPath.exists()) && (dockerInitPath.exists())) && (dockerSocketFile.exists());
}