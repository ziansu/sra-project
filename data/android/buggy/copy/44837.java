@org.springframework.web.bind.annotation.PostMapping(value = "/deletePicture")
public java.lang.String pictureRemove(@org.springframework.web.bind.annotation.RequestParam(value = "pictureId")
long pictureId, org.springframework.ui.Model model) {
    it.uniroma3.spring.model.Picture picture = pictureService.findbyId(pictureId);
    picture.getAuthor().removePicture(picture);
    pictureService.remove(pictureId);
    return pictureManager(model);
}