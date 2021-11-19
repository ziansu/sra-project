@com.sap.pickme.controllers.RequestMapping(value = "/")
public java.lang.String start(org.springframework.ui.Model model) {
    model.addAttribute("restaurants", restaurantService.listSortedRestaurant());
    return "restaurant/list";
}