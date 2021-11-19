@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.RequestMapping(value = " /boards/{gameid}/players/{playerid}/roll", method = RequestMethod.GET, produces = "application/json")
@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Player postRoll(@de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "gameid")
final long gameID, @de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.PathVariable(value = "playerid")
final java.lang.String playerID) throws de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException, de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.PlayerDoesntExistsException {
    if (isGameIdValid(gameID)) {
        return de.haw_hamburg.vs_ws2015.spahl_haug.boards_rest.Main.boardService.getPlayer(gameID, playerID);
    }else {
        throw new de.haw_hamburg.vs_ws2015.spahl_haug.errorhandler.GameDoesntExistsException("Game does not Exists");
    }
}