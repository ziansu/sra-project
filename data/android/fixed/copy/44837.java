@org.springframework.web.bind.annotation.PostMapping(value = "/deletePicture")
public java.lang.String pictureRemove(@org.springframework.web.bind.annotation.RequestParam(value = "pictureId")
long pictureId, org.springframework.ui.Model model) {
    pictureService.remove(pictureId);
    return pictureManager(model);
}