@org.springframework.web.bind.annotation.RequestMapping(value = "/last/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.List<org.sistema.springmvc.forms.models.Cliente> lastClients(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id, @org.springframework.web.bind.annotation.RequestBody
@javax.validation.Valid
org.sistema.springmvc.forms.models.Cliente client) {
    return clienteDAO.lastClients(id);
}