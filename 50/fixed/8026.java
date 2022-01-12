@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    try {
        com.ofcat.whereboardgame.firebase.dataobj.SystemConfigDTO systemConfigDTO = dataSnapshot.getValue(com.ofcat.whereboardgame.firebase.dataobj.SystemConfigDTO.class);
        settingSystemConfig(systemConfigDTO);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}