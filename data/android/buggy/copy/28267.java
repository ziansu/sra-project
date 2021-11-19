public java.util.List<org.gym.model.Attempt> domainListToModelList(java.util.List<org.gym.domain.AttemptEntity> attemptEntities) {
    java.util.List<org.gym.model.Attempt> attempts = new java.util.LinkedList<>();
    for (org.gym.domain.AttemptEntity attemptEntity : attemptEntities) {
        attempts.add(domainToModel(attemptEntity));
    }
    return attempts;
}