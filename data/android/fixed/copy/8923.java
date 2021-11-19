public void addToAllFutureMsg(com.friends.stay.keepintouch.Msg m) {
    com.friends.stay.keepintouch.Contact contact = findContactByMsg(m);
    allFutureMessages.add(m);
    if (contact != null) {
        contact.getFutureMessages().add(m);
    }
}