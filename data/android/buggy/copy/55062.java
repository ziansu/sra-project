@org.springframework.web.bind.annotation.RequestMapping(path = "/addUpdateRole", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority('ADMIN')")
public java.lang.String add(@org.springframework.web.bind.annotation.ModelAttribute
com.exist.model.dto.RoleDto roleDto, org.springframework.ui.Model model) throws com.exist.model.exception.EntityAlreadyExistsException {
    model.addAttribute("roleTypeList", com.exist.model.ref.RoleType.values());
    roleService.create(roleDto);
    return "redirect:/role";
}