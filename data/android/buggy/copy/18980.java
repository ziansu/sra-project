@org.springframework.web.bind.annotation.RequestMapping(value = "/userdelete", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String userdelete(@org.springframework.web.bind.annotation.RequestParam(name = "id")
java.lang.String id) {
    java.lang.System.out.print("idea: ");
    java.lang.System.out.print((id + " "));
    userService.delete(java.lang.Long.valueOf(id));
    return "redirect:/userlist";
}