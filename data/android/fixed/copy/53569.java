@com.github.patrickbcullen.profile.DELETE
@com.github.patrickbcullen.profile.Path(value = "/profile/{id}")
@com.github.patrickbcullen.profile.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deleteProfile(@com.github.patrickbcullen.profile.PathParam(value = "id")
java.lang.String id) {
    profileProducer.send(new org.apache.kafka.clients.producer.ProducerRecord<java.lang.String, com.github.patrickbcullen.profile.ProfileEvent>(topic, id, new com.github.patrickbcullen.profile.ProfileEvent("delete", id)));
    return javax.ws.rs.core.Response.status(204).build();
}