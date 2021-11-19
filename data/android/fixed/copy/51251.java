public java.lang.String generateForm544SerialNo() {
    java.lang.String serialNoMonthPart = ((form544Dao.getForm544CountForCurrentMonth()) + 1) + "";
    java.lang.String serialNoYearPart = ((form544Dao.getForm544CountForCurrentYear()) + 1) + "";
    return (serialNoMonthPart + "/") + serialNoYearPart;
}