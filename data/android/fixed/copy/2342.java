@org.springframework.web.bind.annotation.RequestMapping(value = "/borrarPedido")
public java.lang.String borrarPedido(org.springframework.ui.Model model, com.example.entity.PurchaseOrder order) {
    purchaseOrderRepository.delete(order);
    return "/administrador.html";
}