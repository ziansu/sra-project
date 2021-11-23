@org.springframework.web.bind.annotation.RequestMapping(value = "/listByPhone")
@org.springframework.web.bind.annotation.ResponseBody
public com.zes.squad.gmh.web.common.JsonResult<java.util.List<com.zes.squad.gmh.web.entity.vo.MemberVo>> doListMemberCardsByPhone(java.lang.String phone) {
    java.util.List<com.zes.squad.gmh.web.entity.vo.MemberVo> vos = consumeService.listMemberCardsByPhone(phone);
    return com.zes.squad.gmh.web.common.JsonResult.success(vos);
}