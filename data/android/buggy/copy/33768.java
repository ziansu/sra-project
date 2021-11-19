@org.springframework.web.bind.annotation.PostMapping(value = "/update")
public java.lang.String update(@org.springframework.web.bind.annotation.RequestBody
quanlynhansu.models.dto.HopDongNganHanDTO hd, org.springframework.ui.Model model) throws java.sql.SQLException {
    hopDongNganHan.update(hd);
    java.lang.System.out.println("aaaaaaaaaa");
    return "hopdongnganhan";
}