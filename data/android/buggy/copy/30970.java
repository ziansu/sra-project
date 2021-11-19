@org.junit.Test
public void getNSB2CyNodeMapping() throws java.lang.Exception {
    mapper.putDocument(org.cy3sbml.mapping.Network2SBMLMapperTest.SUID, org.cy3sbml.mapping.Network2SBMLMapperTest.DOC, org.cy3sbml.mapping.Network2SBMLMapperTest.MAPPING);
    assertNotNull(mapper.getNSB2CyNodeMapping());
}