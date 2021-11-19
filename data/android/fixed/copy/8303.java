public int compare(org.retrievable.lucene.searching.support.Hits.Hit h1, org.retrievable.lucene.searching.support.Hits.Hit h2) {
    if ((h1.score) > (h2.score)) {
        return -1;
    }
    if ((h1.score) < (h2.score)) {
        return 1;
    }
    return 0;
}