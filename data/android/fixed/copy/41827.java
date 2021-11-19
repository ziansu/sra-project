public static com.tkporter.sendsms.SendSMSPackage getInstance() {
    if ((com.tkporter.sendsms.SendSMSPackage.instance) == null) {
        com.tkporter.sendsms.SendSMSPackage.instance = new com.tkporter.sendsms.SendSMSPackage();
    }
    return com.tkporter.sendsms.SendSMSPackage.instance;
}