@java.lang.Override
public void registerAttributes(org.jboss.as.controller.registry.ManagementResourceRegistration resourceRegistration) {
    resourceRegistration.registerReadWriteAttribute(org.jboss.as.selfmonitor.SubsystemDefinition.STORAGE_TYPE, null, SelfmonitorStorageTypeHandler.INSTANCE);
}