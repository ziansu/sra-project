@org.springframework.web.bind.annotation.RequestMapping(value = "/data/{menuItem}", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = pt.ist.learning.ui.PagesAdminController.JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String data(@org.springframework.web.bind.annotation.PathVariable
java.lang.String siteId, @org.springframework.web.bind.annotation.PathVariable
org.fenixedu.cms.domain.MenuItem menuItem) {
    return service.data(site(siteId), menuItem).toString();
}