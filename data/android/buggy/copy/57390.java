@java.lang.Override
public com.ontometrics.scraper.extraction.DefaultFieldExtractor field(java.lang.String label, java.lang.String element) {
    getCurrentHtmlExtractor().addManipulator(new com.ontometrics.scraper.extraction.ElementManipulator(new com.ontometrics.scraper.TagOccurrence(element, 0)));
    this.fieldsToGet.add(new com.ontometrics.scraper.extraction.DesignatedField(label, element));
    return this;
}