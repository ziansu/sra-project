@org.springframework.web.bind.annotation.RequestMapping(path = "games", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.Collection<entities.Game> index(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res, @org.springframework.web.bind.annotation.PathVariable
int uid) {
    return dao.indexGame();
}