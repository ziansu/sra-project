protected com.hangover.java.service.Response sendResponse(com.hangover.java.model.BaseEntity item) {
    com.hangover.java.service.wso.ContainerWSO containerWSO = new com.hangover.java.service.wso.ContainerWSO();
    containerWSO.addItems(item);
    return com.hangover.java.service.Response.ok(containerWSO).build();
}