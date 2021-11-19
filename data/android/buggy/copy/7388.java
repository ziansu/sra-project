@java.lang.Override
public void checkValue(java.util.Collection<E> expected) {
    boolean ordered = (theCollection) instanceof org.observe.collect.ObservableOrderedCollection;
    org.junit.Assert.assertThat(theExpected, org.qommons.QommonsTestUtils.collectionsEqual(theSyncedCopy, ordered));
}