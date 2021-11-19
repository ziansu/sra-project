@java.lang.Override
public void onResponse(java.io.Serializable... data) {
    receivedContacts = new java.util.ArrayList<de.qabel.core.config.Contact>(java.util.Arrays.asList(((de.qabel.core.config.Contact[]) (data))));
    stop();
}