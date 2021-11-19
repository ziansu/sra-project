public java.util.List<com.cjam.netshop.entity.Item> getItemListByIndex() throws com.cjam.netshop.entity.BizException {
    java.util.List<com.cjam.netshop.entity.Item> courseLogList = itemDAO.getItemList();
    if (org.apache.commons.collections.CollectionUtils.isEmpty(courseLogList)) {
        throw new com.cjam.netshop.entity.BizException("您最近没有要学习的课程");
    }
    return courseLogList;
}