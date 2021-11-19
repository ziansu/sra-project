@com.szityu.stackoverflow.teamsandplayersdbexample.web.DeleteMapping(value = "/{playerId}")
public void deletePlayer(@com.szityu.stackoverflow.teamsandplayersdbexample.web.PathVariable(value = "playerId")
java.lang.Long playerId) {
    try {
        playerRepo.delete(playerId);
    } catch (org.springframework.dao.EmptyResultDataAccessException ignored) {
        create404Exception(playerId).get();
    }
}