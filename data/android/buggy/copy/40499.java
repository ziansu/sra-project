@java.lang.SuppressWarnings(value = "rawtypes")
@org.springframework.web.bind.annotation.RequestMapping(value = "/update", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public org.springframework.http.ResponseEntity update(@org.springframework.web.bind.annotation.RequestBody
lucson.entity.Invoice invoice) {
    invoiceService.save(invoice);
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
}