public java.util.concurrent.CompletableFuture<io.discloader.discloader.entity.message.Message> sendMessage(java.lang.String content) {
    return loader.rest.sendMessage(this, content, null, null, null);
}