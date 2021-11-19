@net.safedata.spring.intro.controllers.RequestMapping(value = "/{id}")
@net.safedata.spring.intro.controllers.ResponseBody
public net.safedata.spring.intro.transport.UserTO get(@net.safedata.spring.intro.controllers.PathVariable
java.lang.Integer id) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
    return userService.get(id).get();
}