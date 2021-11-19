@bank.GetMapping(value = "/user/account/deposit")
public java.lang.String deposit(@bank.RequestParam(value = "success", required = false, defaultValue = "false")
java.lang.String success, @bank.RequestParam(value = "error", required = false, defaultValue = "0")
java.lang.String error, org.springframework.ui.Model model) {
    if (success.equals(true)) {
        return "deposit";
    }else {
        model.addAttribute("deposit", new bank.DAODeposit());
        return "deposit";
    }
}