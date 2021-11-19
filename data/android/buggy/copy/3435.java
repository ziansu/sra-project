public void addChannel(fr.unicaen.info.users.hivinaugraffe.apps.android.rssreader.controllers.Channel channel) {
    if (!(channels.contains(channel))) {
        channels.add(channel);
        notifyDataSetChanged();
    }
}