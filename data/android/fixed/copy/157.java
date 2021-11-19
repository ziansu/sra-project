public double getCriteria() {
    if (((criteria) == 0) || ((result.resultVote.countNumVoteCri()) == 0))
        return 0.0;
    
    return (this.criteria) / (result.resultVote.countNumVoteCri());
}