@org.springframework.web.bind.annotation.RequestMapping(value = "page", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
public ru.android_studio.pages.entities.Page pageById(java.lang.Long id) {
    ru.android_studio.pages.entities.Page page = pageService.findById(id);
    if (page != null) {
        return page;
    }else {
        throw new ru.android_studio.pages.controllers.EntityNotFoundException("There is no page with given id");
    }
}