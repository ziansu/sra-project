@java.lang.Override
public net.mv.forum.forum.dto.ForumDto findForumById(java.lang.Long id) {
    net.mv.forum.forum.domain.Forum forum = forumRepository.findOne(id);
    net.mv.forum.forum.dto.ForumDto forumDto = new net.mv.forum.forum.dto.ForumDto(forum, forum.getPosts());
    java.lang.System.out.println(forumDto.getPosts());
    return forumDto;
}