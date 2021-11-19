@java.lang.Override
public void onSuccess(com.mindforger.shiftsolver.shared.model.PeriodPreferences result) {
    periodPreferences.setMonthDays(result.getMonthDays());
    periodPreferences.setStartWeekDay(result.getStartWeekDay());
    periodPreferences.setMonthWorkDays(result.getMonthWorkDays());
    refresh(result);
}