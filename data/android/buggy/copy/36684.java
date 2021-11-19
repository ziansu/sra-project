@Test
public void contact_emptiesAllTasksFromArrayList() {
    Contact contact = new Contact("Fist", "Last", "1960/01/01");
    Contact.clear();
    assertEquals(Contact.getNumberList().size(), 0);
}