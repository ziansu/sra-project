public void crawlSubject(java.lang.String subject) {
    Model tdb = dataset.getNamedModel(subject);
    crawlSubject(subject, 0, tdb);
}