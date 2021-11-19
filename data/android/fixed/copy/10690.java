@java.lang.Override
public java.lang.String convertResultToString(java.lang.Object resultValue) {
    com.example.tzadmin.nfc_reader_writer.Models.User u = ((com.example.tzadmin.nfc_reader_writer.Models.User) (resultValue));
    return ((((u.cFirstName) + " ") + (u.cLastName)) + " ") + (u.cSurname);
}