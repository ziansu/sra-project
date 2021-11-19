public java.util.List<java.util.List> getGeneratedDays() {
    if (canGenerate()) {
        projekt.tin.controller.DaysGenerator daysGenerator = new projekt.tin.controller.DaysGenerator();
        return daysGenerator.generateDays(oneDayCallsInQuarter);
    }else {
        return new java.util.ArrayList<java.util.List>();
    }
}