@org.springframework.web.bind.annotation.RequestMapping(value = "/grids", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String grids(javax.servlet.http.HttpSession ses, org.springframework.ui.Model model) {
    java.util.List<com.config.model.Video> videos = com.config.dao.VideoDAO.getInstance().getAllVideos();
    model.addAttribute("videos", videos);
    return "grids";
}