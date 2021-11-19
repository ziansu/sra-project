public com.hubspot.singularity.SingularityCreateResult update(com.hubspot.singularity.SingularityRequest request, com.hubspot.singularity.RequestState requestState, com.hubspot.singularity.SingularityRequestHistory.RequestHistoryType historyType, long timestamp, com.google.common.base.Optional<java.lang.String> user) {
    return save(request, requestState, historyType, timestamp, user);
}