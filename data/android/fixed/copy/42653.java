public void updateVisitedList(actorcomponents.KnowledgeFragment fragmentVisited) {
    if (!(visitedList.contains(fragmentVisited))) {
        visitedList.add(fragmentVisited);
    }
    if (safeUnvisitedList.contains(fragmentVisited)) {
        safeUnvisitedList.remove(fragmentVisited);
    }
}