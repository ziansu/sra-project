@java.lang.Override
public java.lang.String getMatchDetail(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id, org.springframework.ui.Model model) {
    java.lang.System.out.println(id);
    com.rival.hs.match.domain.MatchDo matchDo = matchMongoRepository.findOne(id);
    model.addAttribute("board", matchDo);
    matchDo.toString();
    return "match/match_detail_view";
}