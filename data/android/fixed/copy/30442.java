@org.springframework.web.bind.annotation.RequestMapping(value = UserGroupControllerConst.USERGROUP_CREATE_MAPPING, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String create(@org.springframework.web.bind.annotation.ModelAttribute(value = UserGroupControllerConst.USERGROUP_MODEL_ATTR)
com.softserve.edu.schedule.entity.UserGroup userGroup) {
    userGroupService.create(userGroup);
    userGroupService.addUserToGroup(userGroup.getCurator(), userGroup);
    return UserGroupControllerConst.USERGROUP_REDIRECT_URL;
}