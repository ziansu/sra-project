@org.springframework.web.bind.annotation.GetMapping(value = "/sendadress")
@org.springframework.web.bind.annotation.ResponseBody
public void sendadress(javax.servlet.http.HttpServletRequest request) {
    synchronized(Strlist.map) {
        Strlist.map.put(request.getLocalAddr(), request.getLocalAddr());
    }
}