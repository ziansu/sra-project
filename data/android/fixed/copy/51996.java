private ru.android_studio.pages.entities.Page pageById(@org.jetbrains.annotations.Nullable
java.lang.Long id) {
    ru.android_studio.pages.entities.Page page = pageService.findById(id);
    if (page != null) {
        return page;
    }else {
        throw new ru.android_studio.pages.controllers.EntityNotFoundException("There is no page with given id");
    }
}