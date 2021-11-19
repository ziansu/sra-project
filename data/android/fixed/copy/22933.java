@org.springframework.web.bind.annotation.RequestMapping(value = "/buy", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String buy(@org.springframework.web.bind.annotation.RequestBody
netckr.shop.model.Order order) {
    this.cartService.saveCustomer(order.getUser());
    this.cartService.saveOrder(order);
    return "Order succesfully completed";
}