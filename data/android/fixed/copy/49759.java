@com.psk.pms.controller.RequestMapping(value = "/emp/myview/downloadFile/deleteFile.do", method = RequestMethod.POST)
public void deleteFile(@com.psk.pms.controller.RequestParam(value = "path", required = true)
java.lang.String path, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    com.psk.pms.controller.FileUploadController.LOGGER.info(("method = deleteFile() ,file Name :" + path));
    fileService.deleteFile(path);
}