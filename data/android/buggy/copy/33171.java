@org.springframework.security.access.annotation.Secured(value = lt.tieto.msi2016.roles.Roles.OPERATOR)
@lt.tieto.msi2016.order.controller.RequestMapping(method = RequestMethod.GET, path = "/api/missionsUIByOperator")
public java.util.List<lt.tieto.msi2016.order.model.OrderResults> getOrderResultsByOrderIdForOPerator() throws java.io.IOException {
    return orderResultsService.getOrderResultsByOPeratorID();
}