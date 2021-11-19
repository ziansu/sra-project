@org.junit.Test
public void testCheckContactListContainsAnyWithNull() {
    org.junit.Assert.assertTrue(fact.checkContactListContainsAny(null, true, true));
}