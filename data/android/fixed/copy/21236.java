@org.junit.Test
public void testSetCheckedBoxCharacter() {
    button.setCheckedBoxChar('?');
    org.junit.Assert.assertEquals('?', button.getCheckedBoxChar());
    org.junit.Assert.assertNotEquals('?', button.getEmptyBoxChar());
}