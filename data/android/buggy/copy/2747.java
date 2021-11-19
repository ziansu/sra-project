private edu.oregonstate.cs361.battleship.BattleshipModel fireAt(edu.oregonstate.cs361.battleship.BattleshipModel model, edu.oregonstate.cs361.battleship.Coord shot) {
    if (checkPlayerShot(model, shot)) {
        playerShot(model, shot);
        AIFire(model);
    }
    return model;
}