public static play.mvc.Result einkaufen() {
    return ok(einkaufen.render(models.Model.getBooks(0)));
}