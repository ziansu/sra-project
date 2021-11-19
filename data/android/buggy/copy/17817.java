public static org.ctyc.mgt.summercamp.SummerCampService getInstance() {
    if ((org.ctyc.mgt.summercamp.SummerCampService.instance) == null) {
        org.ctyc.mgt.summercamp.SummerCampService.instance = new org.ctyc.mgt.summercamp.SummerCampService();
    }
    return org.ctyc.mgt.summercamp.SummerCampService.instance;
}