private java.lang.String getEmailBody(java.lang.String email, java.lang.String title, java.lang.String imageUrl, java.lang.String link) {
    java.lang.String body = getString(R.string.invitation_template);
    return body.replace("{user_email}", email).replace("{event_title}", title).replace("{link}", link);
}