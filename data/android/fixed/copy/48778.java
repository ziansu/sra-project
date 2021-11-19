public android.database.Cursor fetchAllFromReminderInfo() {
    return mDb.query(Remindersinfo.TABLE_NAME, new java.lang.String[]{ in.mobme.tvticker.database.Models.Remindersinfo.MEDIA_ID , in.mobme.tvticker.database.Models.Remindersinfo.IS_FAVORITE_FLAG , in.mobme.tvticker.database.Models.Remindersinfo.REMINDER_ENABLED }, null, null, null, null, null);
}