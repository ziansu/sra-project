@java.lang.Override
public void updateItem(com.psk.pms.dao.Item item) {
    jdbcTemplate.update(com.psk.pms.dao.UPDATE_ITEM, item.getItemUnit(), item.getItemName().toUpperCase(), item.getItemType());
}