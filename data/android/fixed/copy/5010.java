@java.lang.Override
public void execute(io.realm.Realm realm) {
    org.fossasia.susi.ai.model.ChatMessage chatMessage = getItem(position);
    chatMessage.setIsImportant(false);
    realm.copyToRealmOrUpdate(chatMessage);
}