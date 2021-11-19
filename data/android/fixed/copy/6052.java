@org.springframework.web.bind.annotation.RequestMapping(value = "/customers/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public CustomerProtos.Customer customer(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id) {
    return this.customerRepository.findById(id);
}