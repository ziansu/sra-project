private void scheduleRegistration() {
    if (started.get()) {
        org.eclipse.leshan.client.servers.RegistrationEngine.LOG.info("Unable to connect to any server, next retry in {}s...", org.eclipse.leshan.client.servers.RegistrationEngine.BS_RETRY);
        registerFuture = schedExecutor.schedule(new org.eclipse.leshan.client.servers.RegistrationEngine.RegistrationTask(), org.eclipse.leshan.client.servers.RegistrationEngine.BS_RETRY, java.util.concurrent.TimeUnit.SECONDS);
    }
}