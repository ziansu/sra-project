@org.springframework.web.bind.annotation.RequestMapping(value = "/updateFoodDetail", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.cathl.icook.entity.TblFoodDetail updateFood(@org.springframework.web.bind.annotation.RequestBody
com.cathl.icook.entity.TblFoodDetail foodDetail, javax.servlet.http.HttpSession session) {
    com.vtth.food.entity.TblFooddetail newFoodDetail = foodDetailService.updateFoodDetail(foodDetail);
    return newFoodDetail;
}