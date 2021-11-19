public java.lang.String getPublicationDate() {
    if ((publicationDate) == null)
        return "null, huh";
    
    return new java.text.SimpleDateFormat("MMM dd, YYYY", java.util.Locale.US).format(publicationDate.getTime());
}