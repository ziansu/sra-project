public static org.openmrs.module.bahmni.ie.apps.model.BahmniFormResource createBahmniFormResource(java.lang.String uuid, java.lang.String valueReference, org.openmrs.module.bahmni.ie.apps.model.BahmniForm bahmniForm) {
    return new org.openmrs.module.bahmni.ie.apps.model.BahmniFormResource() {
        {
            setUuid(uuid);
            setValueReference(valueReference);
            setForm(bahmniForm);
        }
    };
}