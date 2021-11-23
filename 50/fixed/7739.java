@javax.ws.rs.OPTIONS
public javax.ws.rs.core.Response preflight() {
    return javax.ws.rs.core.Response.status(200).header("Access-Control-Allow-Methods", "GET, POST, PUT, PATCH, DELETE").header("Access-Control-Allow-Headers", "Origin, Content-Type, Accept").build();
}