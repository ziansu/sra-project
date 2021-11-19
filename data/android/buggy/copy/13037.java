@org.springframework.web.bind.annotation.RequestMapping(value = "/show")
public void show(javax.servlet.http.HttpServletResponse resp, @org.springframework.web.bind.annotation.RequestParam
java.lang.Long prodId) {
    java.lang.String prodImg = prodService.getById(prodId).getProdImg();
    if (prodImg != null) {
        tw.com.queautiful.commons.util.FileProcessing.showImg(resp, prodImg);
    }
}