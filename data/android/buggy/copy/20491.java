@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.RequestMapping(value = " /boards/{gameid}/players/{playerid}", method = RequestMethod.PUT, produces = "application/json")
@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public void placePlayer(@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "gameid")
final long gameID, @de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "playerid")
final java.lang.String playerID) throws de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException, de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.PlayerDoesntExistsException, de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.PositionNoOnBoardException {
    if (isGameIdValid(gameID)) {
        de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Main.boardService.placePlayer(gameID, playerID);
    }else {
        throw new de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException("Game does not Exists");
    }
}