@com.baifendian.swordfish.webserver.api.controller.GetMapping(value = "/test")
public com.baifendian.swordfish.webserver.api.dto.BaseResponse testDataSource(@com.baifendian.swordfish.webserver.api.controller.RequestAttribute(value = "session.user")
com.baifendian.swordfish.dao.model.User operator, @com.baifendian.swordfish.webserver.api.controller.RequestParam(value = "type", required = true)
java.lang.String type, @com.baifendian.swordfish.webserver.api.controller.RequestParam(value = "parameter", required = true)
java.lang.String parameter, javax.servlet.http.HttpServletResponse response) {
    return datasourceService.testDataSource(com.baifendian.swordfish.dao.enums.DbType.valueOf(type), parameter, response);
}