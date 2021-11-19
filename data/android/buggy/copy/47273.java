@java.lang.Override
public java.util.List<java.lang.String> getComments(java.lang.String post_id) throws com.cisco.cmad.api.PostNotFoundException, com.cisco.cmad.api.RendezvousException {
    java.util.List<java.lang.String> comments = null;
    comments = mapi.getComments(post_id);
    if (comments == null) {
        throw new com.cisco.cmad.api.PostNotFoundException();
    }
    return comments;
}