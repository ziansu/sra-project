public play.mvc.Result signupForm() {
    return ok(views.html.signup.render(play.data.Form.form(controllers.Application.User.class)));
}