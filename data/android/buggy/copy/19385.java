@java.lang.Override
public void save(com.github.union.blog.domain.Post post) {
    logger.info(("Save entity:" + (post.toString())));
    postRepository.save(post);
}