public void updateCursor(com.alibaba.otter.canal.protocol.ClientIdentity clientIdentity, com.alibaba.otter.canal.protocol.position.Position position) throws com.alibaba.otter.canal.meta.exception.CanalMetaManagerException {
    super.updateCursor(clientIdentity, position);
    updateCursorTasks.add(clientIdentity);
}