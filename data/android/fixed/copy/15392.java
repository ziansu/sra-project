public boolean isFailed() {
    return (cm.aptoide.pt.v8engine.billing.authorization.Authorization.Status.CANCELLED.equals(status)) || (cm.aptoide.pt.v8engine.billing.authorization.Authorization.Status.UNKNOWN_ERROR.equals(status));
}