@dao.Before
public void createXMLParserObject() {
    xmlParser = new dao.XMLParser();
    dao.MovieListManager listManager = new dao.MovieListManager();
    java.util.ArrayList<dao.Movie> movieList = listManager.getMovieList();
}