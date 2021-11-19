@org.springframework.web.bind.annotation.RequestMapping(value = "mobile/circle/update")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String update(javax.servlet.http.HttpServletRequest request, java.lang.String phone, com.ezb.jdb.model.Circle circle) {
    return circleServiceImpl.update(request, phone, circle);
}