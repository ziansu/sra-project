public ninja.Result moveCard(ninja.Context context, @ninja.params.PathParam(value = "columnFrom")
int colFrom, @ninja.params.PathParam(value = "columnTo")
int colTo, models.Game g) {
    g.move(colFrom, colTo);
    g.error = false;
    return ninja.Results.json().render(g);
}