@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "order/save", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public by.itechart.flowerty.persistence.model.Order save(@org.springframework.web.bind.annotation.RequestBody
by.itechart.flowerty.persistence.model.Order orderToSave) {
    by.itechart.flowerty.web.controller.OrderController.LOGGER.info("Checkout order: {}", orderToSave);
    return orderService.save(orderToSave);
}