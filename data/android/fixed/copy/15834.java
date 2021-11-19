@FBLT.controllers.advert.RequestMapping(value = "/post-advert")
public org.springframework.web.servlet.ModelAndView postAdvert() {
    return new org.springframework.web.servlet.ModelAndView("post_ad");
}