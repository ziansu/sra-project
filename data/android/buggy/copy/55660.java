@java.lang.Override
public univ.bigdata.course.movie.Movie movieWithHighestAverage() {
    java.util.List<univ.bigdata.course.movie.Movie> movArray = getTopKMoviesAverage(1);
    return movArray.get(0);
}