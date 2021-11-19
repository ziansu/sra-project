public com.mediamath.terminalone.models.T1Entity save(com.mediamath.terminalone.models.T1Entity entity) throws com.mediamath.terminalone.exceptions.ClientException, com.mediamath.terminalone.exceptions.ParseException {
    if (entity == null)
        return null;
    
    if (!(isAuthenticated()))
        return null;
    
    com.mediamath.terminalone.models.T1Entity response = postService.save(entity);
    return response;
}