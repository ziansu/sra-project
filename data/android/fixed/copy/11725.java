public void setScore(int score) {
    if (score < 0) {
        throw new domain.DomainException("Score mag niet negatief zijn.");
    }
    this.score = score;
}