@org.springframework.web.bind.annotation.RequestMapping(value = "BuyGame.do", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView removeOneGameFromDatabase(@org.springframework.web.bind.annotation.RequestParam(value = "id")
com.toStriiing.data.Inventory inventory) {
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView();
    mv.setViewName("customerdashboard");
    idao.markGameAsSold(inventory);
    return mv;
}