public void reply(com.party.ijurong.pojo.Reply reply) {
    replyMapper.insertSelective(reply);
    if ((reply.getParentId()) != null) {
        replyMapper.increaseReplyNum(reply.getParentId());
    }
}