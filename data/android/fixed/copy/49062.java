public void testDeleteExistingLine() {
    assertEquals((("deleted from " + (fileName)) + ": \"jumped over the moon\"\n"), TextBuddy.deleteExistingLine("2"));
}