@org.springframework.web.bind.annotation.RequestMapping(value = { "sltSkillsAjax" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.abilists.core.bean.model.UserTechModel sltSkillsAjax(@org.springframework.web.bind.annotation.RequestBody
com.abilists.core.bean.para.users.SltUserTechPara sltUserTechPara) throws java.lang.Exception {
    logger.info(("sltUserTechPara. MtNo >> " + (sltUserTechPara.getUtNo())));
    com.abilists.core.bean.model.UserTechModel userTech = usersService.sltUserTech(sltUserTechPara);
    return userTech;
}