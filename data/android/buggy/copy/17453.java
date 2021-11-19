public java.lang.String getAttendeesString() {
    java.lang.String str = "";
    for (ContactManager.Contact contact : attendees) {
        str = (contact.getId()) + "";
    }
    return str;
}