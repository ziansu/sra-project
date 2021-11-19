@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/uploaddoc")
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.MULTIPART_FORM_DATA)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public javax.ws.rs.core.Response uploadDocuments(@com.sun.jersey.multipart.FormDataParam(value = "file")
java.io.InputStream uploadedInputStream, @com.sun.jersey.multipart.FormDataParam(value = "file")
com.sun.jersey.core.header.FormDataContentDisposition fileDetail, @com.sun.jersey.multipart.FormDataParam(value = "path")
java.lang.String path, @com.sun.jersey.multipart.FormDataParam(value = "userId")
java.lang.String userId);