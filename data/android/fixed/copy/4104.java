@org.springframework.web.bind.annotation.RequestMapping(value = "/getNodeName", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.TEXT_PLAIN_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getNodeName() throws java.net.UnknownHostException {
    java.net.InetAddress ip = java.net.InetAddress.getLocalHost();
    return ip.getHostName();
}