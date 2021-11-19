@org.junit.Test
public void canAddChannelToPrivateChannelDatabaseForUser() {
    rx.Observable<com.novoda.bonfire.channel.data.model.Channel> channelObservable = firebaseChannelsDatabase.addChannelToUserPrivateChannelIndex(user, newChannel);
    com.novoda.bonfire.helpers.FirebaseTestHelpers.assertValueReceivedOnNext(channelObservable, newChannel);
}