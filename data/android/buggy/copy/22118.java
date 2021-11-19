@org.springframework.web.bind.annotation.RequestMapping(value = "/delete")
public java.lang.String delete(@org.springframework.web.bind.annotation.RequestParam(value = "id")
int id, org.springframework.ui.Model model) {
    userMovieDao.delete(userMovieDao.getUserMovieByID(activeUser, movieDao.mapMovie(tmdbMovies, id)));
    return "forward:home";
}