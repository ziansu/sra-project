@io.swagger.annotations.ApiOperation(value = "Creates a new Kafka topic")
@io.swagger.annotations.ApiResponses(value = { @io.swagger.annotations.ApiResponse(message = "Returns saved Kafka topic", code = 200) })
@org.springframework.web.bind.annotation.RequestMapping(value = "/topic", method = org.springframework.web.bind.annotation.RequestMethod.POST)
org.springframework.http.ResponseEntity<org.apache.metron.rest.model.KafkaTopic> save(@io.swagger.annotations.ApiParam(name = "topic", value = "Kafka topic", required = true)
@org.springframework.web.bind.annotation.RequestBody
final org.apache.metron.rest.model.KafkaTopic topic) throws org.apache.metron.rest.RestException {
    return new org.springframework.http.ResponseEntity(kafkaService.createTopic(topic), org.springframework.http.HttpStatus.CREATED);
}