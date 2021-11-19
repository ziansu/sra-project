boolean isDueTime() {
    boolean result = (java.lang.System.currentTimeMillis()) >= (nextEventAtMillis);
    log.trace("{} is due: {}", name, result);
    return result;
}