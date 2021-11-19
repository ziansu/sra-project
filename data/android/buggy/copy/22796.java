private boolean isValidItem(com.ctrip.framework.apollo.core.dto.ItemDTO item) {
    return (item != null) && (!(com.ctrip.framework.apollo.core.utils.StringUtils.isContainEmpty(item.getKey(), item.getValue())));
}