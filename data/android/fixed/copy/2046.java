@org.springframework.web.bind.annotation.RequestMapping(path = "getFilm.do", params = "keyword")
public org.springframework.web.servlet.ModelAndView getFilmsByKeyWord(@org.springframework.web.bind.annotation.RequestParam(name = "keyword")
java.lang.String keyword) {
    java.lang.String viewName = "WEB-INF/views/home.jsp";
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView(viewName);
    java.util.List<com.skilldistillery.film.data.Film> films = dao.getFilmsByKeyWord(keyword);
    mv.addObject("films", films);
    return mv;
}