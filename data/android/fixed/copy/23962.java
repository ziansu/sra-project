public org.ethereum.net.shh.WhisperMessage setTopics(org.ethereum.net.shh.Topic... topics) {
    this.topics = (topics != null) ? topics : new org.ethereum.net.shh.Topic[0];
    return this;
}