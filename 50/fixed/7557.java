public void run() {
    long tst = java.lang.Long.parseLong(org.universAAL.context.che.Activator.getProperties().getProperty("RECYCLE.KEEP", "0"));
    db.removeOldEvents(((java.lang.System.currentTimeMillis()) - tst));
}