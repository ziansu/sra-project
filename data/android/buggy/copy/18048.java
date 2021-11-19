public java.util.List<com.epam.asw.sty.model.Item> findItemsForUserbyChannelByCountSortedbyTitle(long shortid, java.lang.String user, int count, java.lang.String orderItemField) {
    java.util.List<com.epam.asw.sty.model.Item> items = itemDao.findForUserbyChannelByCountSortedbyTitle(shortid, user, count, orderItemField);
    return items;
}