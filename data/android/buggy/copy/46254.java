@org.springframework.web.bind.annotation.RequestMapping(value = "/forgetResetPassword", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public cn.edu.swpu.cins.dto.response.HttpResult<java.lang.String> forgetResetPassword(java.lang.String username, java.lang.String newPassword, java.lang.String forgetToken) {
    return userService.fofgetResetPassword(username, newPassword, forgetToken);
}