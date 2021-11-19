public void testSaveableWithoutFirstName() throws java.lang.Exception {
    setSaveable();
    person.setFirstName(null);
    assertFalse(person.isSavable());
}