@java.lang.Override
public java.lang.Object getPosts() {
    com.mongodb.client.FindIterable<org.bson.Document> allPosts = null;
    allPosts = mapi.getPosts();
    return allPosts;
}