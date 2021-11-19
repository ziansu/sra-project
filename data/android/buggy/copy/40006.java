@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Integer> getRepositoryScoreById(int id) {
    org.gitmining.bean.RepoScore repoScore = repositoryDao.getRepoScoreById(id);
    return getRepositoryScoreByIdStub();
}