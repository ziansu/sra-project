@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String printWelcome() {
    info.fges.blablacool.helpers.MailHelper mailHelper = new info.fges.blablacool.helpers.MailHelper();
    return "home";
}