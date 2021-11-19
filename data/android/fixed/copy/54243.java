@org.springframework.security.access.prepost.PreAuthorize(value = "@currentUserServiceImpl.canAccessUser(principal, #userId)")
@ch.wisv.areafiftylan.controller.RequestMapping(value = "/{userId}", method = RequestMethod.GET)
public ch.wisv.areafiftylan.model.User getUserById(@ch.wisv.areafiftylan.controller.PathVariable
java.lang.Long userId) {
    return this.userService.getUserById(userId);
}