@org.junit.Test
public void testSequenceOfNullsAndValues() {
    org.obiba.magma.ValueSequence sequence = org.obiba.magma.type.TextType.get().sequenceOf("\"\",\"Not Null\",\"\"");
    assertSequence(sequence, new java.lang.String[]{ null , "Not Null" , null });
}