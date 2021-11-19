private void writeResultsToResponse(final org.sonar.api.server.ws.Response response, final de.rinderle.softvis3d.base.domain.tree.RootTreeNode snapshotTreeResult) {
    final de.rinderle.softvis3d.base.result.SoftVis3dJsonWriter jsonWriter = new de.rinderle.softvis3d.base.result.SoftVis3dJsonWriter(response.stream().output());
    this.treeNodeJsonWriter.transformRootTreeToJson(jsonWriter, snapshotTreeResult);
}