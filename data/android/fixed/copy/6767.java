java.lang.String nextUrl() {
    java.lang.String nextUrl;
    do {
        nextUrl = pagesToVisit.remove(0);
    } while (pagesVisited.contains(nextUrl) );
    pagesVisited.add(nextUrl);
    return nextUrl;
}