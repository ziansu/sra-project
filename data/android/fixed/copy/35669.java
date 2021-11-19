@pandora.clone.controller.GetMapping(value = "/login/{username}/{password}")
public java.lang.String login(@pandora.clone.controller.PathVariable
java.lang.String username, @pandora.clone.controller.PathVariable
java.lang.String password) {
    return jwtTokenUtil.login("0", username);
}