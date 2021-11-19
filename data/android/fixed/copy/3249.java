@android.support.annotation.CheckResult
public static <T> com.busybusy.dbc.conditions.ObjectCondition<T> check(T subject) {
    return new com.busybusy.dbc.conditions.ObjectCondition(subject);
}