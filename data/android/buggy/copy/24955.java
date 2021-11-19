private float calcProbabilityTimesOccurrence(ch.bfh.bti7535.w2016.algorithm.features.AbstractFeature feature, ch.bfh.bti7535.w2016.data.Classification classification) {
    float probability = feature.getProbability(classification);
    float occurrence = feature.getOccurrence(classification);
    return probability * occurrence;
}