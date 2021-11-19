public org.apache.lucene.search.ScoreDoc getInitial() {
    return (pqType) == (org.apache.lucene.search.TestHitQueue.PQTYPE.Sent) ? ((org.apache.lucene.search.HitQueue) (hq)).top() : new org.apache.lucene.search.ScoreDoc(0, 0.0F);
}