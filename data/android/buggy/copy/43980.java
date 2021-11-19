@java.lang.Override
public java.util.List<com.cinemaonline.model.client.FilmInfo> getAllReleaseFilmsByPage(int page) {
    return com.cinemaonline.model.client.FilmInfo.parseFI(filmDao.getAllReleaseFilmsByPage(page));
}