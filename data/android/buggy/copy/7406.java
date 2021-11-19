@java.lang.Override
public void requestInitialized(javax.servlet.ServletRequestEvent requestEvent) {
    try {
        requestEvent.getServletRequest().setAttribute(ParamDefine.HIBERNATE_SESSION, logia.hibernate.util.HibernateUtil.beginTransaction());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}