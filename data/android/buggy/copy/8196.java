public static boolean joinChannel(int userId, int channelId) {
    return (!(Codo.Model.Channel.isCreater(channelId, userId))) && (Codo.Util.Database.update(java.lang.String.format("INSERT INTO %s (user_id, channel_id) VALUE ('%d','%d');", CONSTANT.TABLE.USER_CHANNEL, userId, channelId)));
}