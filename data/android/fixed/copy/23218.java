public static <T> void deferredDeleteEntity(T t) {
    if (null == t)
        return ;
    
    com.googlecode.objectify.ObjectifyService.ofy().defer().delete().entity(t);
}