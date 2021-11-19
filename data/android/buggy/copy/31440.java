@java.lang.Override
public void addBridge(bots.Bot bot, java.lang.String channelTo, java.lang.String channelFrom) {
    this.sendToList.add(org.javatuples.Triplet.with(bot, channelTo, channelFrom));
}