public void loadVisite(java.lang.String element) {
    m_GoogleMap.clear();
    theron_b.com.visitetablette.tool.DataExplorer dataExplorer = new theron_b.com.visitetablette.tool.DataExplorer(element, m_GoogleMap);
    m_ListPlacesObjects = dataExplorer.getM_ListPlacesObjects();
}