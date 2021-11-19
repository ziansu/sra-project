@org.springframework.web.bind.annotation.PostMapping(value = "/api/scores/post")
public cse280.project.api.scores.Score postScore(@org.springframework.web.bind.annotation.RequestBody
cse280.project.api.scores.Score score) {
    cse280.project.api.scores.ScoreManager.addScore(score);
    return score;
}