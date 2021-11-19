@org.springframework.web.bind.annotation.PostMapping(value = "/stats")
public java.lang.Object getStats(@org.springframework.web.bind.annotation.RequestBody
kr.ac.yonsei.fyea.web.model.StatsQueryModel queryModel) {
    java.util.List<java.lang.String> list = new java.util.ArrayList<>();
    list.add(ColumnTypes.COUNSELING_COUNT);
    queryModel.setSurveys(list);
    return kr.ac.yonsei.fyea.util.StatsDataUtils.getStatistics(statsService.getStatsQueryData(queryModel));
}