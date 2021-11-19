@org.springframework.web.bind.annotation.DeleteMapping(value = "/settingWebsite/user/delete")
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
public void deleteUser(@org.springframework.web.bind.annotation.RequestBody
int id) {
    userService.delete(id);
}