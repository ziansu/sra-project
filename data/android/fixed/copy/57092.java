public int getNotAckedMessageCount(java.util.UUID channelID) {
    if ((unAckedMsgCountMap.get(channelID)) != null) {
        return unAckedMsgCountMap.get(channelID).get();
    }else {
        return -1;
    }
}