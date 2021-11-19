@org.springframework.web.bind.annotation.RequestMapping(value = "", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String create(com.aud.pojo.NavMenu navMenu) {
    navMenu.setParentNav(3);
    navMenu.setLang("zh");
    this.navMenuMapper.insertSelective(navMenu);
    return "redirect:/admin/newsCategories";
}