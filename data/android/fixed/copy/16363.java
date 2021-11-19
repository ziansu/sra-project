public void addReportList(java.lang.String location, java.lang.String waterType, java.lang.String waterCondition) {
    com.allstarproject.cs2340.allstarwatercrowdsourcingapp.model.WaterResourceReport waterResourceReport = new com.allstarproject.cs2340.allstarwatercrowdsourcingapp.model.WaterResourceReport(location, waterType, waterCondition, reportNumber);
    com.allstarproject.cs2340.allstarwatercrowdsourcingapp.model.Model.printList.add(waterResourceReport);
}