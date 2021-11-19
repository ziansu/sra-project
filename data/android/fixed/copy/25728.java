public static java.lang.String parseItemIdFromAlephItemId(java.lang.String itemId) {
    return (itemId.split(AlephConstants.UNIQUE_ITEM_ID_SEPARATOR).length) > 1 ? itemId.split(AlephConstants.UNIQUE_ITEM_ID_SEPARATOR)[1] : null;
}