@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/{id}")
@javax.ws.rs.Produces(value = "text/plain")
public boolean deleteJson(int id) {
    return messageController.deleteById(id);
}