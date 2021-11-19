@org.springframework.web.bind.annotation.RequestMapping(value = "/borrarPedido")
public java.lang.String borrarPedido(org.springframework.ui.Model model, com.example.entity.PurchaseOrder order) {
    com.example.entity.PurchaseOrder thatOrder = purchaseOrderRepository.findByCode(order.getCode());
    purchaseOrderRepository.delete(thatOrder);
    return "/administrador.html";
}