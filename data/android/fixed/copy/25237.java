@org.springframework.web.bind.annotation.RequestMapping(value = "/sqrt", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.lang.Double> sqrt(@org.springframework.web.bind.annotation.RequestBody
java.lang.Double number) {
    return new org.springframework.http.ResponseEntity<java.lang.Double>(rService.sqrt(number), org.springframework.http.HttpStatus.CREATED);
}