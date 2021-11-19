@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteProdImg{productId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String deleteImg(@org.springframework.web.bind.annotation.RequestParam(value = "imgName")
java.lang.String imgName, @org.springframework.web.bind.annotation.PathVariable
@org.springframework.format.annotation.NumberFormat
java.lang.Integer productId) {
    picture.deletePicture(imgName);
    return "redirect:/admin/editProduct&" + productId;
}