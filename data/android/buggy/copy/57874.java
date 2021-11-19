@play.db.jpa.Transactional
public static controllers.Result logout() {
    session().clear();
    flash("success", "You've been logged out");
    return ok();
}