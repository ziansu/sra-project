@java.lang.Override
protected void updateToFail(org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer target) {
    org.openhealthtools.mdht.uml.hl7.datatypes.CD code = DatatypesFactory.eINSTANCE.createCD();
    code.setCodeSystem("");
    target.setCode(code);
}