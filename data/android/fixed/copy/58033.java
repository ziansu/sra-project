@org.junit.Test
public void testGetTrendingPosts() {
    java.util.List<services.dataAccess.proto.PostProto.Post> post = redditSource.getTrendingPosts("", 1, null);
    assertEquals(1, post.size());
}