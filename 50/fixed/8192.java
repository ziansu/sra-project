public static java.lang.String latLngToTimezoneString(double lat, double lng) {
    java.lang.String tzId = TimezoneMapper.timezoneStrings[TimezoneMapper.getTzInt(((float) (lat)), ((float) (lng)))];
    return tzId;
}