@org.junit.Test
public void canSetNewChannelInChannelsDatabaseAndReturnIt() {
    rx.Observable<com.novoda.bonfire.channel.data.model.Channel> channelObservable = firebaseChannelsDatabase.writeChannel(newChannel);
    com.novoda.bonfire.helpers.FirebaseTestHelpers.assertValueReceivedOnNext(channelObservable, newChannel);
}