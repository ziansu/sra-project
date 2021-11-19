@org.springframework.web.bind.annotation.RequestMapping(value = "")
public java.lang.String index(org.springframework.ui.Model model) {
    model.addAttribute("venues", "venues");
    model.addAttribute("venues", venueDao.findAll());
    return "venue/index";
}