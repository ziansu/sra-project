public void testDeleteExistingLine() {
    assertEquals(TextBuddy.deleteExistingLine("2"), (("deleted from " + (fileName)) + ": \"jumped over the moon\"\n"));
}