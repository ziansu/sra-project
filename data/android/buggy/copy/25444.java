@org.springframework.scheduling.annotation.Scheduled(fixedRate = 30000)
public void repeatedRequest() {
    kr.tagnote.ScheduleConfig.logger.info(("result : " + (kr.tagnote.util.HttpUtils.getJson(restTemplate, kr.tagnote.ScheduleConfig.REQUEST_URL, null))));
}