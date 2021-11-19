@com.flights.user.controller.RequestMapping(value = "/updateinfo", method = RequestMethod.POST)
public org.springframework.http.ResponseEntity updateInfo(@com.flights.user.controller.RequestBody
com.flights.user.pojo.UserChangeInfoRequest request) {
    boolean success = userService.changeUserAdditionalInfo(request);
    if (success) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
    }else {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
    }
}