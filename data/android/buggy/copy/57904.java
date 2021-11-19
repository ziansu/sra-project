@ro.tamadawines.core.resource.POST
@ro.tamadawines.core.resource.Path(value = "/updateProduct")
@io.dropwizard.hibernate.UnitOfWork
@ro.tamadawines.core.resource.Consumes(value = { javax.ws.rs.core.MediaType.MULTIPART_FORM_DATA })
public ro.tamadawines.persistence.model.Product updateProduct(@org.glassfish.jersey.media.multipart.FormDataParam(value = "product")
ro.tamadawines.persistence.model.Product product, @org.glassfish.jersey.media.multipart.FormDataParam(value = "image")
java.io.InputStream fileInputStream, @org.glassfish.jersey.media.multipart.FormDataParam(value = "file")
org.glassfish.jersey.media.multipart.FormDataContentDisposition contentDisposition) {
    ro.tamadawines.core.resource.ProductResource.LOGGER.info("Updating product: {}", product);
    return addProduct(product, fileInputStream, contentDisposition);
}