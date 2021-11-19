public static void index() {
    play.Logger.info("Rendering Dashboard");
    models.Member member = controllers.Accounts.getLoggedInMember();
    java.util.List<models.Assessment> assessmentlist = new java.util.ArrayList(member.assessmentlist);
    render("dashboard.html", member, assessmentlist);
}