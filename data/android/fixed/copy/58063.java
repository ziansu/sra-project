@org.junit.Test
public void publicChannelsIdsAreObservedFromPublicChannelDatabase() {
    rx.Observable<java.util.List<java.lang.String>> listObservable = firebaseChannelsDatabase.observePublicChannelIds();
    assertValueReceivedOnNext(listObservable, publicChannelIds);
}