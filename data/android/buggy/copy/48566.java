private boolean isType(org.hl7.fhir.dstu3.model.Base item, java.lang.String type) {
    if (item.fhirType().equals(type))
        return true;
    
    return false;
}