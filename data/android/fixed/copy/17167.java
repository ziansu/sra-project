@java.lang.Override
protected void createSpace() {
    super.createSpace();
    m_hmm = new markovmodel.FastRestrictedHMM_sentiment(epsilon, this.sigma, m_corpus.getLargestSentenceSize(), this.number_of_topics);
}