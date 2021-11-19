public void sendMailResetPassword(models.User user, play.libs.mailer.MailerClient mc) throws java.net.MalformedURLException {
    java.lang.String email = user.email;
    sendMail(user, models.Token.TypeToken.password, email, mc);
}