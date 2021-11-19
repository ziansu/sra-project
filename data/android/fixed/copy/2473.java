@io.swagger.annotations.ApiOperation(value = "客户端-机器人赔率列表")
@com.racing.controller.user.RequestMapping(value = "/robot/rate", method = RequestMethod.GET)
public java.lang.Object robotRate() {
    java.lang.Integer userId = com.racing.util.LoginStatusSaveUtil.getUserClientId();
    return wechatClientService.select(userId);
}