@org.springframework.web.bind.annotation.GetMapping(value = "@{username}")
public cooksys.dto.UserDto getUsername(@org.springframework.web.bind.annotation.PathVariable
java.lang.String username) throws cooksys.exception.UserException {
    cooksys.dto.UserDto user = userService.get(username);
    if (user == null) {
        throw new cooksys.exception.UserException("User does not exist");
    }
    return userService.get(username);
}