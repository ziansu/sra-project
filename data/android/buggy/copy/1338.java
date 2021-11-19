@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void upload(org.springframework.web.multipart.MultipartHttpServletRequest multipartRequest, javax.servlet.http.HttpServletResponse response) {
    java.util.Map<java.lang.String, org.springframework.web.multipart.MultipartFile> files = multipartRequest.getFileMap();
    services.upload(files);
}