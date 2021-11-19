@org.junit.Test
public void shouldMoveToNext() {
    providedHasCount(3);
    final boolean success = mTested.moveToNext();
    junit.framework.Assert.assertTrue(success);
    junit.framework.Assert.assertEquals(1, mTested.getPosition());
}