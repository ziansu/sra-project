@java.lang.Override
public boolean evaluate(com.rometools.rome.feed.synd.SyndEntry object) {
    return (object.getPublishedDate().compareTo(relevantDate)) >= 0;
}