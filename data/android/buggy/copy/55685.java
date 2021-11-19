@java.lang.Override
public com.mongodb.client.FindIterable<org.bson.Document> getPosts(int offset, int size) {
    com.mongodb.client.FindIterable<org.bson.Document> numPosts = null;
    numPosts = mapi.getPosts(size);
    if (numPosts == null) {
        return null;
    }
    return numPosts;
}