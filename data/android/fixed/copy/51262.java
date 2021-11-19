public void testName() {
    com.csahmad.moodcloud.Profile profile = new com.csahmad.moodcloud.Profile("test");
    assertEquals("test", profile.getName());
    profile.setName("new");
    assertEquals("new", profile.getName());
}