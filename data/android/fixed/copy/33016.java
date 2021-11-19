public static org.silverpeas.poc.client.local.blog.PostCriteria fromPost(org.silverpeas.poc.client.local.blog.Post post) {
    org.silverpeas.poc.client.local.blog.PostCriteria postCriteria = new org.silverpeas.poc.client.local.blog.PostCriteria();
    postCriteria.blogId = post.getAppInstanceId();
    postCriteria.postId = post.getId();
    return postCriteria;
}