@org.springframework.web.bind.annotation.RequestMapping(value = "/checkUserIdFromToken", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.Boolean checkiUserIdFromToken(@org.springframework.web.bind.annotation.RequestParam(value = "token")
java.lang.String token, @org.springframework.web.bind.annotation.RequestParam(value = "id")
java.lang.String id) {
    java.lang.System.out.println((((" U USER CONTOLLER token id " + (userService.getUserIdFromToken(token))) + " id ") + id));
    return userService.getUserIdFromToken(token).equals(id);
}