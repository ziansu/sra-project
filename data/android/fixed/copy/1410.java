@org.springframework.web.bind.annotation.RequestMapping(value = "/insertaCliente", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView insertaCliente(@org.springframework.web.bind.annotation.ModelAttribute(value = "SpringWeb")
urudata.project.objects.Client cliente, org.springframework.ui.ModelMap model) {
    outsourcerService.InsertarCliente(cliente);
    return new org.springframework.web.servlet.ModelAndView("gestionNuevoCliente", "client", new urudata.project.objects.Client());
}