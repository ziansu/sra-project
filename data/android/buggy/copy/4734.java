public java.lang.Integer numGamesPlayed() {
    return models.Game.find("(one.email = ? or two.email = ?) and winner is not null", email, email).fetch().size();
}