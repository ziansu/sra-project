@org.springframework.transaction.annotation.Transactional
public java.util.List<com.codegroup.challengecloud.model.Challenge> findAll() {
    if ((com.codegroup.challengecloud.services.ChallengeService.challengesAll) != null)
        return com.codegroup.challengecloud.services.ChallengeService.challengesAll;
    else
        return com.codegroup.challengecloud.services.ChallengeService.challengesAll = challengeDao.findAll();
    
}