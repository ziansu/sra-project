public java.util.List<com.analyzer.service.analysis.JiraSprintPointAnalysis> getBoardPointAnalysis(java.lang.String boardId) {
    java.util.List<com.analyzer.service.analysis.JiraSprintIssues> sprintIssues = jiraIssueService.getBoardParentIssues(boardId);
    java.util.List<com.analyzer.service.analysis.JiraSprintPointAnalysis> pointAnalyses = getPointAnalysis(sprintIssues);
    return pointAnalyses;
}