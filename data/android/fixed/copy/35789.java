void stopObservation(uk.co.strangeskies.observable.Observation<M> observer) {
    if ((observations.remove(observer)) && (observations.isEmpty())) {
        observations = null;
    }
}