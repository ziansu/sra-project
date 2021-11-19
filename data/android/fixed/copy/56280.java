public java.lang.String saveNewRateFile() {
    rateFileService.createRateFile(rateFile);
    messageUtil.addMessage("message.ratefile.created.title", "message.ratefile.created.detail", rateFile.getName());
    return "views/rate/admin/manageRates.xhtml";
}