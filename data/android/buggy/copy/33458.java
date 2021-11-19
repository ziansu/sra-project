@org.springframework.web.bind.annotation.RequestMapping(value = "/userProfile/submitUpdateUserProfile", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String updateUserProfileAction(@org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String userName, @org.springframework.web.bind.annotation.RequestParam(value = "login")
java.lang.String userLogin, @org.springframework.web.bind.annotation.RequestParam(value = "password")
java.lang.String userPassword, @org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.Integer userId) {
    userService.updateUser(new com.ar0ne.app.core.user.Client(userId, userName, userLogin, userPassword, true));
    return "redirect:/userProfile/" + userId;
}