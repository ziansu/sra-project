public se.meer.jpa.model.Issue createOrUpdateIssue(se.meer.jpa.model.Issue issue) {
    issueRepository.save(issue);
    return issueRepository.save(issue);
}