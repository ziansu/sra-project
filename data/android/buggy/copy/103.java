private void registerChatMemberObservers(boolean register) {
    com.BC.entertainment.chatroom.helper.ChatRoomMemberCache.getInstance().registerRoomMemberChangedObserver(roomMemberChangedObserver, register);
}