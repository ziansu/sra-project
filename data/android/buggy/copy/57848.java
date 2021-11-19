@org.springframework.web.bind.annotation.RequestMapping(value = "/index")
public java.lang.String index(org.springframework.ui.ModelMap model) {
    com.pillbox.po.User user = new com.pillbox.po.User();
    user.setOpen_id("3135fdfa13512351");
    userDao.save(user);
    model.addAttribute("message", "你好");
    return "hello";
}