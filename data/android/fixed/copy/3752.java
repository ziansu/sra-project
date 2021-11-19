public synchronized void remove() {
    synchronized(channelList) {
        channelList.remove(remove_position);
        remove_position = -1;
        notifyDataSetChanged();
    }
}