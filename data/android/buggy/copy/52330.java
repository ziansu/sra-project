@java.lang.Override
protected com.teamagam.gimelgimel.domain.messages.entity.MessageText createMessage(java.lang.String senderId) {
    return new com.teamagam.gimelgimel.domain.messages.entity.MessageText(null, senderId, null, com.teamagam.gimelgimel.domain.utils.TextUtils.trim(mText));
}