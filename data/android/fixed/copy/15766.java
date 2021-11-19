public java.lang.String execute() {
    if (loginService.login(username, password)) {
        this.result = "success";
        return "success";
    }else {
        this.result = "fail";
        return "fail";
    }
}