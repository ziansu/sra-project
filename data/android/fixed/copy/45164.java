@org.springframework.web.bind.annotation.RequestMapping(value = "/list", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public java.util.ArrayList<be.ehb.restservermetdatabase.model.User> list() {
    return be.ehb.restservermetdatabase.dao.UserDao.getUsers();
}