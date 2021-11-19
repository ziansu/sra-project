public void delete(no.mesan.model.User user) {
    logDao.undo(user.getId());
    no.mesan.websocket.LogUpdate.updateClients();
}