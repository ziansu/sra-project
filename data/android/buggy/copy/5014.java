public com.revolware.poll.Question getCurrentQuestion() {
    if (((questions.size()) != 0) || ((curQuestion) == (-1)))
        return questions.get(curQuestion);
    
    return null;
}