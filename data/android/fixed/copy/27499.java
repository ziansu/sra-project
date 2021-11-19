public java.lang.String mayClose() {
    if (!(added)) {
        return Utils.messages.detailsMayCloseMessage(field.getDisplayName());
    }
    return null;
}