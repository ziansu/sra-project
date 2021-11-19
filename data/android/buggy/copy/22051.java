public ilarkesto.feeds.FeedItem setPubDate(ilarkesto.core.time.DateAndTime pubDate) {
    return setPubDate((pubDate == null ? null : Tm.FORMAT_RFC822.format(pubDate.getDate())));
}