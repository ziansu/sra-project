@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.view.RedirectView redirectMain() {
    return new org.springframework.web.servlet.view.RedirectView("/welcome");
}