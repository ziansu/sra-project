private boolean eventExists(int eventId) {
    return (this.serializer.getItem(eventId, this)) != null;
}