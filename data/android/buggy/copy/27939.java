@org.springframework.web.bind.annotation.RequestMapping(value = "/{logId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String manageUsers(org.springframework.ui.ModelMap model, javax.servlet.http.HttpServletRequest request, @org.springframework.web.bind.annotation.PathVariable(value = "logId")
int logId) {
    com.denimgroup.threadfix.service.util.ControllerUtils.addItem(request, "logId", logId);
    return "redirect:/configuration/logs";
}