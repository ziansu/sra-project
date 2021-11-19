public void updateVisitedList(actorcomponents.KnowledgeFragment fragmentVisited) {
    visitedList.add(fragmentVisited);
    if (safeUnvisitedList.contains(fragmentVisited)) {
        safeUnvisitedList.remove(fragmentVisited);
    }
}