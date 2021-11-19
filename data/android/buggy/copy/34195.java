@org.springframework.web.bind.annotation.RequestMapping(value = { "/" , "/accounts" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String accounts(org.springframework.ui.Model model) {
    java.lang.String str = "Some additional data.";
    java.util.List<me.eoh_digital.model.AccountEntity> accounts = accountService.findAll();
    model.addAttribute("data", accounts);
    return "accountSearch";
}