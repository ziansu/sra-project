private java.lang.String getCharType(int nid) {
    java.lang.String characteristic = gov.va.isaac.util.OTFUtility.getConPrefTerm(nid);
    return gov.va.isaac.request.uscrs.USCRSBatchTemplate.PICKLIST_Characteristic_Type.find(characteristic).toString();
}