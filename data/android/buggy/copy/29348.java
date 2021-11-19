@com.eagle.rest.POST
@com.eagle.rest.Path(value = "channel")
public java.lang.String recordChannel(com.eagle.entity.EagleRecordEntity eagleRecordEntity) {
    service.JobsService.createAndPersistNewJob(eagleRecordEntity);
    return "TEST";
}