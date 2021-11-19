@org.junit.Test
public void testSetCheckedBoxCharacter() {
    button.setCheckedBoxChar('?');
    org.junit.Assert.assertNotEquals('?', button.getCheckedBoxChar());
    org.junit.Assert.assertEquals('?', button.getEmptyBoxChar());
}