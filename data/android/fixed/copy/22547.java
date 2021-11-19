protected void initToolbox(javax.servlet.ServletContext context) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(toolBoxLocation)) {
        toolboxManager = org.apache.velocity.tools.view.servlet.ServletToolboxManager.getInstance(context, toolBoxLocation);
    }else {
        org.apache.velocity.app.Velocity.info("VelocityViewServlet: No toolbox entry in configuration.");
    }
}