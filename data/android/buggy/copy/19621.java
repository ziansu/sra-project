void addNode(com.mbzshajib.mining.processor.uncertain.model.UNode node, java.lang.String id, int index) {
    com.mbzshajib.mining.processor.uncertain.model.HeaderTableItem item = findHeaderTableItemById(id);
    item.addNodeItem(node, index);
}