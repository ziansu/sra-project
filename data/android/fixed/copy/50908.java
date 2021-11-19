@java.lang.Override
public net.sharksystem.sharknet.api.Chat newChat(java.util.List<net.sharksystem.sharknet.api.Contact> recipients) {
    if ((myProfile) == null)
        return null;
    
    net.sharksystem.sharknet.api.Chat chat = new net.sharksystem.sharknet.api.ImplChat(recipients, myProfile);
    chat_list.add(chat);
    return chat;
}