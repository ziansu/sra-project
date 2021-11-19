@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(value = "/majorBuild")
public com.topview.common.CommonResult<com.topview.po.major.MajorArticle> majorBuild(@org.springframework.web.bind.annotation.RequestParam(value = "majorId")
int majorId) {
    com.topview.common.CommonResult<com.topview.po.major.MajorArticle> commonResult = majorBuildService.selectService(majorId);
    return commonResult;
}