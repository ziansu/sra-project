public static void destroy() {
    ar.edu.unq.unidad3.wop.service.runner.SessionFactoryProvider.INSTANCE.sessionFactory.close();
    ar.edu.unq.unidad3.wop.service.runner.SessionFactoryProvider.INSTANCE = null;
}