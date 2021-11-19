@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public cn.momia.service.web.response.ResponseMessage addFeedback(@org.springframework.web.bind.annotation.RequestParam
java.lang.String content, @org.springframework.web.bind.annotation.RequestParam
java.lang.String email) {
    if (!(commonServiceFacade.addFeedback(content, email)))
        return cn.momia.service.web.response.ResponseMessage.FAILED("提交反馈意见失败");
    
    return cn.momia.service.web.response.ResponseMessage.SUCCESS;
}