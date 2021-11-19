protected void requireOwner(com.myproject.user.model.User user) {
    if (com.myproject.framework.api.InvocationContext.getContext().isOwner(user.getId())) {
        throw new com.myproject.framework.api.NotAuthorizedException();
    }
}