public void updateCursor(com.alibaba.otter.canal.protocol.ClientIdentity clientIdentity, com.alibaba.otter.canal.protocol.position.Position position) throws com.alibaba.otter.canal.meta.exception.CanalMetaManagerException {
    updateCursorTasks.add(clientIdentity);
    super.updateCursor(clientIdentity, position);
}