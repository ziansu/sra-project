@java.lang.Override
public co.edu.unicartagena.platf.entity.User findUserByUsernameOrEmail(java.lang.String argument) throws co.edu.unicartagena.platf.dao.exception.NotCreatedEntityManagerException {
    java.util.List<co.edu.unicartagena.platf.dao.controller.Parameter> params = java.util.Arrays.asList(new co.edu.unicartagena.platf.dao.controller.Parameter("signIn", argument));
    return executeNamedQuery("user.findByUsernameOrEmail", params);
}