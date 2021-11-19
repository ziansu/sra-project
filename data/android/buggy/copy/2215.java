@Test
public void clear_clearMembers_0() {
    Member testMember = new Member("Lincoln");
    Member.clear();
    assertEquals(Member.all().size(), 0);
}