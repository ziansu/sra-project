boolean isDueTime() {
    return (java.lang.System.currentTimeMillis()) >= (nextEventAtMillis);
}