@java.lang.Override
public com.cisco.blogger.api.Blog getBlogById(java.lang.String blogId) {
    org.bson.types.ObjectId id = new org.bson.types.ObjectId(blogId);
    com.cisco.blogger.api.Blog blog = findOne("_id", id);
    return blog;
}