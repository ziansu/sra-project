@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteImg{productId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView deleteImg(@org.springframework.web.bind.annotation.RequestParam(value = "imgName")
java.lang.String imgName, @org.springframework.web.bind.annotation.PathVariable
@org.springframework.format.annotation.NumberFormat
java.lang.Integer productId) {
    picture.deletePicture(imgName);
    return new org.springframework.web.servlet.ModelAndView(("redirect:/admin/editProduct&" + productId));
}