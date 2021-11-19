@org.springframework.web.bind.annotation.RequestMapping(value = "/save")
@org.springframework.web.bind.annotation.ResponseBody
public com.welkin.commons.Message save(com.welkin.pojo.TbItem po, @org.springframework.web.bind.annotation.RequestParam(value = "desc", required = false)
java.lang.String desc, @org.springframework.web.bind.annotation.RequestParam(value = "itemParams", required = false)
java.lang.String params) {
    int x = tbItemService.save(po, desc, params);
    return com.welkin.commons.MessageUtil.generateStatus(x);
}