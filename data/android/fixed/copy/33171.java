@org.springframework.security.access.annotation.Secured(value = lt.tieto.msi2016.roles.Roles.OPERATOR)
@lt.tieto.msi2016.order.controller.RequestMapping(method = RequestMethod.GET, path = "/api/missionsByName/{name}")
public java.util.List<lt.tieto.msi2016.order.model.OrderResults> getOrderResultsByOrderIdForOPerator(@lt.tieto.msi2016.order.controller.PathVariable
java.lang.String name) throws java.io.IOException {
    return orderResultsService.getOrderResultsByOPeratorID(name);
}