@javax.xml.bind.annotation.XmlElement(name = "range")
public void setRanges(java.util.List<controller.channel.map.ChannelRange> ranges) {
    mRanges.clear();
    for (controller.channel.map.ChannelRange range : ranges) {
        mRanges.add(range);
    }
    validate();
}