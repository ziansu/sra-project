public java.util.List<com.cjam.netshop.entity.Item> getItemListByIndex(java.lang.Integer type) throws com.cjam.netshop.entity.BizException {
    java.util.List<com.cjam.netshop.entity.Item> courseLogList = itemDAO.getItemList(type);
    if (org.apache.commons.collections.CollectionUtils.isEmpty(courseLogList)) {
        throw new com.cjam.netshop.entity.BizException("您最近没有要学习的课程");
    }
    return courseLogList;
}