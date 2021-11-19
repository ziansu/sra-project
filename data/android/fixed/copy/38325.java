@org.springframework.web.bind.annotation.GetMapping(path = "/delete")
public org.springframework.web.servlet.ModelAndView RemoveBuildings(@org.springframework.web.bind.annotation.RequestParam
java.lang.String buildingName) {
    buildingRepository.delete(buildingName);
    return new org.springframework.web.servlet.ModelAndView("redirect:/buildings");
}