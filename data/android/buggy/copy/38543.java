@java.lang.Override
public void contextInitialized(javax.servlet.ServletContextEvent sce) {
    javax.servlet.ServletContext servletContext = sce.getServletContext();
    org.fao.unredd.layers.LayerFactory layerFactory;
    layerFactory = new org.fao.unredd.layers.bd.DBLayerFactory("workspace:newlayer");
    servletContext.setAttribute("layer-factory", layerFactory);
}