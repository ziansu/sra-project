@com.psk.pms.controller.RequestMapping(value = "/emp/myview/downloadFile/deleteFile.do", method = RequestMethod.POST)
public void deleteFile(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.lang.String filePath = request.getParameter("filePath");
    fileService.deleteFile(filePath);
    com.psk.pms.controller.FileUploadController.LOGGER.info(("method = deleteFile() ,file Name :" + filePath));
}