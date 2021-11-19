@com.synacy.moviehouse.schedule.RequestMapping(method = RequestMethod.DELETE, value = "/{scheduleId}")
@com.synacy.moviehouse.schedule.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
public void deleteSchedule(@com.synacy.moviehouse.schedule.PathVariable(value = "scheduleId")
java.lang.Long scheduleId) {
    scheduleService.deleteSchedule(scheduleId);
}