@java.lang.Override
public org.cytoscape.work.TaskIterator createTaskIterator(java.io.InputStream inputStream, java.lang.String inputName) {
    return new org.cytoscape.work.TaskIterator(new org.cytoscape.io.internal.read.xgmml.SessionXGMMLNetworkReader(inputStream, cyNetworkFactory, renderingEngineMgr, cyRootNetworkManager, readDataMgr, parser, unrecognizedVisualPropertyMgr, cyNetworkManager, cyApplicationManager));
}