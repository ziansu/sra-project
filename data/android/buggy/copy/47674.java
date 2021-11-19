private void sleep() {
    try {
        java.lang.Thread.currentThread().sleep(ua.yurkov.scriptengine.service.script.thread.ScriptThreadServiceImpl.WAITING_TIME_FOR_CANCEL);
    } catch (java.lang.InterruptedException e) {
        log.warn(e.getMessage());
    }
}