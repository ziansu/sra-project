@java.lang.Override
public void handleField(com.zhartunmatthew.web.contactbook.entity.Contact contact, java.lang.String data) {
    java.lang.Long id = java.lang.Long.parseLong(data);
    if (id.equals(0L)) {
        contact.setNationality(null);
    }else {
        contact.setNationality(id);
    }
}