@org.springframework.web.bind.annotation.CrossOrigin
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.DELETE, value = "/user")
public org.springframework.http.HttpEntity<java.lang.Void> deleteUser(@org.springframework.web.bind.annotation.RequestBody
com.prodyna.ted.entity.User user) {
    userService.deleteUser(user);
    return new org.springframework.http.ResponseEntity<java.lang.Void>(org.springframework.http.HttpStatus.OK);
}