protected boolean verifyLogin(com.amazonaws.services.lambda.runtime.Context context) {
    return !(((context.getIdentity().getIdentityId()) == null) || (context.getIdentity().getIdentityId().isEmpty()));
}