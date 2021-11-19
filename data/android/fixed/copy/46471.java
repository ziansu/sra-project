public void testSaveableWithoutFirstName() throws java.lang.Exception {
    setSaveable();
    person.setFirstName(null);
    assertTrue(person.isSavable());
}