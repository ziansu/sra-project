public void loginCallback(fr.esgi.projet.softwareneedsyou.models.DataModel model, com.mashape.unirest.http.JsonNode user) {
    if (user.isArray()) {
        model.setUser(new com.google.gson.Gson().fromJson(user.toString(), fr.esgi.projet.softwareneedsyou.models.UserModel.class));
    }
}