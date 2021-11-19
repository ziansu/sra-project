public void init(byte indexNameId, long entityId, java.lang.String keyId, int startTime, int endTime, java.lang.Object value) {
    super.init(NeoCommandType.DYN_INDEX_ADD_COMMAND, indexNameId, IndexEntityType.Node.id(), entityId, keyId, startTime, endTime, value);
}