@java.lang.Override
protected void initEditAttributes(by.pvt.module3.entity.User user, org.springframework.ui.Model model) {
    by.pvt.module3.service.UserRoleService userRoleService = new by.pvt.module3.service.UserRoleService();
    model.addAttribute(by.pvt.module3.command.user.UserCommand.LIST_USER_ROLE, userRoleService.getAll());
}