@java.lang.Override
protected void doInBack() throws java.lang.Exception {
    com.avoscloud.chat.service.CacheService.cacheUserIfNone(message.getFrom());
}