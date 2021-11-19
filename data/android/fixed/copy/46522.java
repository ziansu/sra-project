@java.lang.Override
public java.util.List<com.cinemaonline.model.client.FilmInfo> getAllFilmsByPage(int page) {
    return com.cinemaonline.model.client.FilmInfo.parseFI(filmDao.getAllUnreleasedFilmsByPage(page), filmDao);
}