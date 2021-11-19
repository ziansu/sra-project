@org.springframework.context.annotation.Bean(name = "org.tiogasolutions.notify.kernel.config.CouchEnvironment")
public org.tiogasolutions.notify.kernel.config.CouchEnvironment couchEnvironment() {
    return new org.tiogasolutions.notify.kernel.config.CouchEnvironment().setTesting(true);
}