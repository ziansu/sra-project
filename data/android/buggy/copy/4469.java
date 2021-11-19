@org.springframework.web.bind.annotation.RequestMapping(value = tran.example.presentation.controller.LoginFormController.DISPLAY_LOG_IN_MAPPING, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String displayLogin(java.security.Principal principal, org.springframework.ui.ModelMap model) {
    return loginFormControllerService.displayLogin(principal, model);
}