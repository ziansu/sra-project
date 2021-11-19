public boolean save() throws client.dao.ServerErrorException, java.io.IOException {
    core.http.Response response = this.send_request(new core.http.Request("/~save", "GET"), this.user);
    return true;
}