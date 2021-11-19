@org.springframework.web.bind.annotation.RequestMapping(value = "/insertaCliente", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView insertaCliente(@org.springframework.web.bind.annotation.ModelAttribute(value = "SpringWeb")
urudata.project.objects.Client cliente, org.springframework.ui.ModelMap model) {
    outsourcerService.InsertarCliente(cliente);
    javax.swing.JOptionPane.showMessageDialog(null, "Cliente creado con exito", "Cliente nuevo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    return new org.springframework.web.servlet.ModelAndView("gestionNuevoCliente", "client", new urudata.project.objects.Client());
}