@org.apache.shiro.authz.annotation.RequiresPermissions(value = "arsenal:stock:list")
@com.bjsts.manager.controller.purchase.RequestMapping(value = "/list", method = { RequestMethod.GET , RequestMethod.POST })
public java.lang.String list(com.bjsts.manager.query.user.UserSearchable stockSearchable, @org.springframework.data.web.PageableDefault(size = com.bjsts.manager.core.constants.GlobalConstants.DEFAULT_PAGE_SIZE, sort = "createdTime", direction = Sort.Direction.DESC)
org.springframework.data.domain.Pageable pageable, org.springframework.ui.ModelMap modelMap) {
    java.util.List<com.bjsts.manager.entity.purchase.StockEntity> stockEntityList = stockService.get().findAll();
    modelMap.addAttribute("list", stockEntityList);
    return "stock/list";
}