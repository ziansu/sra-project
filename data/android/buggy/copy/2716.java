@org.springframework.web.bind.annotation.RequestMapping(value = "/profile/alerts", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView savedAlert(java.security.Principal principal, @javax.validation.Valid
ch.unibe.ese.team1.controller.pojos.forms.AlertForm alertForm, org.springframework.validation.BindingResult result) {
    if (!(result.hasErrors()))
        return prepareAlertPage(principal, true, alertForm);
    else
        return new org.springframework.web.servlet.ModelAndView("alerts");
    
}