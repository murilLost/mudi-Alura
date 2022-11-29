package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Monitor Gamer 24''");
		pedido.setUrlImagem("https://images.kabum.com.br/produtos/fotos/168368/monitor-gamer-samsung-24-ips-75-hz-full-hd-freesync-hdmi-lf24t350fhlmzd_1667910573_g.jpg");
		pedido.setUrlProduto("https://produto.mercadolivre.com.br/MLB-1963572397-monitor-gamer-24-full-hd-serie-t350-samsung-bivolt-_JM?searchVariation=92575517730#searchVariation=92575517730&position=4&search_layout=grid&type=item&tracking_id=2b55914c-9a2b-46c5-8732-fe10ba9d13ec&DEAL_ID=MLB12112&S=landingHubblack-friday&V=21&T=CarouselDynamic-normal&L=COMPRE-AGORA-COM-AS-MELHORES-PROMOCOES&deal_print_id=69fe9e50-7012-11ed-908a-b3f58660543e&c_id=carouseldynamic-normal&c_element_order=undefined&c_campaign=COMPRE-AGORA-COM-AS-MELHORES-PROMOCOES&c_uid=69fe9e50-7012-11ed-908a-b3f58660543e");
		pedido.setDescricao("Tenha a melhor experiência de imagem com o Monitor Gamer 24'' Full Hd Série T350 Samsung Bivolt. A taxa de atualização de 75Hz oferece cenas mais fluidas. Seu momento de diversão não tem LAG ou efeito fantasma, quer você esteja assistindo a um vídeo ou jogando um jogo.\r\n");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
	
}
