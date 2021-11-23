public org.ops4j.pax.exam.Option getLoggingOption() {
    return org.ops4j.pax.exam.karaf.options.KarafDistributionOption.editConfigurationFilePut(org.opendaylight.controller.config.it.base.AbstractConfigTestBase.ORG_OPS4J_PAX_LOGGING_CFG, logConfiguration(org.opendaylight.controller.config.it.base.AbstractConfigTestBase.class), LogLevel.INFO.name());
}