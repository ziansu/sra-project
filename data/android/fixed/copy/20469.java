public void testEditTags() {
    com.CMPUT301W15T02.teamtoapp.User user = new com.CMPUT301W15T02.teamtoapp.User("Sarah");
    user.addTag(null);
    user.editTag(null, null);
    assertEquals("Edit tags?", true, user.getTags().contains("tage"));
}