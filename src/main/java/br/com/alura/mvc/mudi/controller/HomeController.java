package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;
import br.com.alura.mvc.mudi.repository.Mock;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	//@Autowired
	//private PedidoRepository pedidoRepository;
	
	@GetMapping
	public ModelAndView home() {
		
		ModelAndView mv = new ModelAndView("home");
		
		if(Mock.pedidos.isEmpty()) {
		
			Pedido pedido = new Pedido();
			pedido.setNomeProduto("Monitor Gamer 24''");
			pedido.setUrlImagem("https://images.kabum.com.br/produtos/fotos/168369/monitor-gamer-samsung-22-ips-75-hz-full-hd-freesync-hdmi-vga-vesa-lf22t350fhlmzd_1639601852_original.jpg");
			pedido.setUrlProduto("https://produto.mercadolivre.com.br/MLB-1963572397-monitor-gamer-24-full-hd-serie-t350-samsung-bivolt-_JM?searchVariation=92575517730#searchVariation=92575517730&position=4&search_layout=grid&type=item&tracking_id=2b55914c-9a2b-46c5-8732-fe10ba9d13ec&DEAL_ID=MLB12112&S=landingHubblack-friday&V=21&T=CarouselDynamic-normal&L=COMPRE-AGORA-COM-AS-MELHORES-PROMOCOES&deal_print_id=69fe9e50-7012-11ed-908a-b3f58660543e&c_id=carouseldynamic-normal&c_element_order=undefined&c_campaign=COMPRE-AGORA-COM-AS-MELHORES-PROMOCOES&c_uid=69fe9e50-7012-11ed-908a-b3f58660543e");
			pedido.setDescricao("Tenha a melhor experiência de imagem com o Monitor Gamer 24'' Full Hd Série T350 Samsung Bivolt. A taxa de atualização de 75Hz oferece cenas mais fluidas. Seu momento de diversão não tem LAG ou efeito fantasma, quer você esteja assistindo a um vídeo ou jogando um jogo.\r\n");
			pedido.setValorNegociado(new BigDecimal("2000.00"));
			pedido.setDataEntrega(LocalDate.parse("2020-01-08"));
			pedido.setStatus(StatusPedido.APROVADO);
			
			Pedido pedido2 = new Pedido();
			pedido2.setNomeProduto("Teclado Gamer");
			pedido2.setUrlImagem("https://images.kabum.com.br/produtos/fotos/99696/teclado-gamer-hyperx-alloy-core-rgb-membrana-hx-kb5me2-br__1547726580_gg.jpg");
			pedido2.setUrlProduto("https://www.kabum.com.br/produto/99696/teclado-gamer-hyperx-alloy-core-rgb-abnt2-hx-kb5me2-br?gclid=Cj0KCQiA7bucBhCeARIsAIOwr--4QlH8FyZI-TA-0OD3AKjqZNWR_0iWgmS6aDV9wO6kdEDxqNf4QNEaAkKDEALw_wcB");
			pedido2.setDescricao("O teclado gamer HyperX Alloy Core é moderno e com tecnologias de última geração. Com barra de luz, exclusiva HyperX, os efeitos de iluminação são dinâmicas e proporcionam cores vivas e brilhantes. Os efeitos de iluminação impressionam, são suaves e elegantes, com 6 efeitos predefinidos e com a opção de ser configurados da forma que os usuários preferirem. As teclas são sensíveis, silenciosas e ágeis, permitindo ao usuário uma teclagem rápida e proporcional ao click, com apenas 45 gramas para o acionamento da função. Dessa forma, é possível eliminar o efeito ghosting e possibilita uma sensação tátil confortável e que proporciona resultados incríveis. Tecle de forma frenética, realize movimentos e obtenha vantagem no campo de batalha. O Teclado Gamer Alloy Core possui alta resistência, testado e comprovado para resistir a líquidos, possui uma estrutura plástica reforçada. Em seu menu de teclas, a teclas de recursos de multimídia, com teclas exclusivas, com fácil acesso para alterações de brilho, efeitos e perfis. Adquira o seu teclado gamer e aumente sua performance, aumentando sua taxa de vitória. Aproveite as ofertas e promoções do KaBuM!.");
			pedido2.setValorNegociado(new BigDecimal("300.00"));
			pedido2.setDataEntrega(LocalDate.parse("2022-10-26"));
			pedido2.setStatus(StatusPedido.AGUARDANDO);
			
			Pedido pedido3 = new Pedido();
			pedido3.setNomeProduto("Computador Gamer");
			pedido3.setUrlImagem("https://images.kabum.com.br/produtos/fotos/337163/pc-gamer-skill-strong-amd-ryzen-5-3600-16gb-ddr4-ssd-256gb-geforce-rtx-3050-6gb-650w-80-plus-63212_1653478775_gg.jpg");
			pedido3.setUrlProduto("https://www.kabum.com.br/produto/337163/pc-gamer-skill-strong-amd-ryzen-5-3600-16gb-ddr4-ssd-256gb-geforce-rtx-3050-6gb-650w-80-plus-63212?gclid=Cj0KCQiA7bucBhCeARIsAIOwr-_1QebaluiSuzuiAo_6L1uV2YX6fMWv2pcZXQweZy5W40pokh5XJeAaAjADEALw_wcB");
			pedido3.setDescricao("PC Gamer Skill Strong, AMD Ryzen 5 3600, 16GB DDR4, SSD 256GB, Geforce RTX 3050 6GB, 650W 80 Plus - 63212 Processador Ryzen AMD 5 ");
			pedido3.setValorNegociado(new BigDecimal("8000.00"));
			pedido3.setDataEntrega(LocalDate.parse("2021-03-14"));
			pedido3.setStatus(StatusPedido.ENTREGUE);
			
			Mock.pedidos.add(pedido);
			Mock.pedidos.add(pedido2);
			Mock.pedidos.add(pedido3);
		}
		
		//List<Pedido> pedidos = pedidoRepository.findAll();
		
		mv.addObject("pedidos", Mock.pedidos);
		return mv;
	}
	
	@GetMapping("/{status}")
	public ModelAndView homeAguardando(@PathVariable("status") String status) {
		List<Pedido> pedidosPorStatus = new ArrayList<Pedido>();
		ModelAndView mv = new ModelAndView("home");
		
		//List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedido.valueOf(status));
		
		for (Pedido pedido : Mock.pedidos) {
			if (pedido.getStatus() == StatusPedido.valueOf(status.toUpperCase()) ) {
				pedidosPorStatus.add(pedido);
			}
		}
		
		mv.addObject("status", status);
		mv.addObject("pedidos", pedidosPorStatus);
		
		return mv;
	}
	
	//Serve para retornar a home caso o usuário digite alguma URL inválida
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
	
}
