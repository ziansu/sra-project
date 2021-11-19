public boolean removeSubRequest(PlayerObject player) {
    for (SubRequestObject req : subRequests) {
        if (req.playerToBeReplaced.equals(player))
            return subRequests.remove(req);
        
    }
    return false;
}