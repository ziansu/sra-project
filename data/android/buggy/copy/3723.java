@java.lang.Override
public org.openmrs.patientflags.rest.wrapper.FlagWrapper newObject() {
    return org.openmrs.patientflags.rest.util.FlagUtil.flagsConverter(org.openmrs.api.context.Context.getService(org.openmrs.module.patientflags.api.FlagService.class).getFlag(getUuidProperty()));
}