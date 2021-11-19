@FBLT.controllers.advert.RequestMapping(value = "/post-advert")
public org.springframework.web.servlet.ModelAndView postAdvert(org.springframework.ui.Model model, @FBLT.controllers.advert.ModelAttribute(value = "username")
java.lang.String username) {
    if (!(model.containsAttribute("username"))) {
        model.addAttribute("username", "false");
    }
    return new org.springframework.web.servlet.ModelAndView("post_ad");
}