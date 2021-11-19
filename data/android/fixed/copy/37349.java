@java.lang.Override
public java.util.List<java.lang.Integer> getStoryIdListByTagIdList(java.util.List<java.lang.Integer> tagIds) {
    tagIds.add((-1));
    return tagRelationDao.getStoryIdListByTagIdList(tagIds);
}