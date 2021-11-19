@org.springframework.web.bind.annotation.RequestMapping(value = "/500_error")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String test500ErrorController() throws com.ninelephas.alopex.controller.ControllerException {
    throw new java.lang.NullPointerException("抛出一个测试的ControllerException错误");
}