@org.junit.Test
public void channelDetailsAreReadFromChannelsDatabase() {
    rx.Observable<com.novoda.bonfire.channel.data.model.Channel> channelObservable = firebaseChannelsDatabase.readChannelFor("new channel");
    assertValueReceivedOnNext(channelObservable, newChannel);
}