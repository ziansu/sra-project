@org.springframework.web.bind.annotation.RequestMapping(path = "login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity logIn(javax.servlet.http.HttpServletResponse httpServletResponse, @org.springframework.web.bind.annotation.RequestBody
com.github.olegbal.urlshortingtool.domain.dto.LoginAndPasswordDto loginAndPasswordDto) {
    if (tokenAuthenticationService.checkLogin(httpServletResponse, loginAndPasswordDto)) {
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.ACCEPTED);
    }
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.UNAUTHORIZED);
}