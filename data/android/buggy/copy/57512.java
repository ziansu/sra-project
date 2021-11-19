@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.view.RedirectView redirectMain() {
    org.springframework.web.servlet.view.RedirectView redirectView = new org.springframework.web.servlet.view.RedirectView();
    redirectView.setUrl("/welcome");
    return redirectView;
}