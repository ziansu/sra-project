protected double calculateVBF(long initialRTO) {
    return config.getInt(NetworkConfigDefaults.ACK_TIMEOUT_SCALE);
}