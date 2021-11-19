@java.lang.Override
public co.edu.unicartagena.platf.entity.User findUserByUsername(java.lang.String username) throws co.edu.unicartagena.platf.dao.exception.NotCreatedEntityManagerException {
    java.util.List<co.edu.unicartagena.platf.dao.controller.Parameter> parameters = java.util.Arrays.asList(new co.edu.unicartagena.platf.dao.controller.Parameter("username", username));
    return executeNamedQuery("user.findByUsername", parameters);
}