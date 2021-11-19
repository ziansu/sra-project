public void restoreChannelsFromProfile() {
    try {
        channelTableModel_.setChannels(((java.util.List<org.micromanager.micronuclei.internal.data.ChannelInfo>) (userProfile_.getObject(profileClass_, org.micromanager.micronuclei.internal.gui.ChannelPanel.CHANNELDATA, null))));
    } catch (java.io.IOException ex) {
    } catch (java.lang.NullPointerException npe) {
    }
}