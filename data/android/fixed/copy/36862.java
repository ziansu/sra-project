@java.lang.Override
public com.einzig.ipst2.portal.PortalSubmission build(java.lang.String name, java.util.Date dateResponded, java.lang.String message) {
    java.lang.String pictureURL = parsePictureURL(message, name);
    return new com.einzig.ipst2.portal.PortalSubmission(name, dateResponded, pictureURL);
}