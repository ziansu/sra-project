public static void destroy() {
    if (((ar.edu.unq.unidad3.wop.service.runner.SessionFactoryProvider.INSTANCE) != null) && ((ar.edu.unq.unidad3.wop.service.runner.SessionFactoryProvider.INSTANCE.sessionFactory) != null)) {
        ar.edu.unq.unidad3.wop.service.runner.SessionFactoryProvider.INSTANCE.sessionFactory.close();
    }
    ar.edu.unq.unidad3.wop.service.runner.SessionFactoryProvider.INSTANCE = null;
}