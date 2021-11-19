@org.springframework.web.bind.annotation.RequestMapping(value = "/showInfo/{userId}")
public java.lang.String showUserInfo(org.springframework.ui.ModelMap modelMap, @org.springframework.web.bind.annotation.PathVariable
int userId) {
    logger.debug("-----------------------showUserInfo-----------------------");
    com.roy.demo.model.UserInfo userInfo = userService.getUserById(userId);
    modelMap.addAttribute("userInfo", userInfo);
    return "/user/showInfo";
}