@org.junit.Test
public void canSetNewChannelInChannelsDatabaseAndReturnIt() {
    rx.Observable<com.novoda.bonfire.channel.data.model.Channel> channelObservable = firebaseChannelsDatabase.writeChannel(newChannel);
    assertValueReceivedOnNext(channelObservable, newChannel);
}