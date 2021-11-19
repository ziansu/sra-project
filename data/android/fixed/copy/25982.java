@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putBooleanArray(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_CHECKED_DAYS, mCheckedDays);
    outState.putLong(com.jdelorenzo.capstoneproject.ModifyRoutineActivity.EXTRA_WORKOUT_ID, mRoutineId);
}