public sneer.flux.Action sendMessage(java.lang.String text) {
    return sneer.flux.Action.action("send-message", "contact-id", id, "text", text);
}