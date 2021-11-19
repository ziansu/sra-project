@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteGroup", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void deleteGroup(@org.springframework.web.bind.annotation.RequestBody
com.luxoft.wheretogo.controller.Group group, java.security.Principal principal) {
    if (principal != null) {
        group.setDeleted(com.luxoft.wheretogo.controller.RestServiceController.DELETED);
        groupsService.update(group, principal.getName());
    }
}