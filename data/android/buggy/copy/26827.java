@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/plant/wind/{plantid}/edit/", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String EditWindPlant(@org.springframework.web.bind.annotation.ModelAttribute(value = "windplant")
models.WindPlantWithState windPlant, @org.springframework.web.bind.annotation.PathVariable(value = "plantid")
int id) {
    DAO.WindPlantDAO dao = ((DAO.WindPlantDAO) (context.getBean("windplantdao")));
    int windeditstatus = dao.editWindPlant(id, windPlant);
    return "redirect:../../";
}