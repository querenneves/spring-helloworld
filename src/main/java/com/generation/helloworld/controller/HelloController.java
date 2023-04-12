package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class HelloController {

	@GetMapping
	public String hello() {
		return "<b>Hello World!</b>";
	}

	@GetMapping("/bsmlist")
	public String bsmlist() {
		return "<h2>Responsabilidade Pessoal</h2>\r\n"
				+ "<p>Responsabilidade pessoal se enquadra em quatro características: assumir responsabilidade, trabalhar duro, manter compromissos e não dar desculpas.</p>\r\n"
				+ "\r\n" + "<h2>Mentalidade de Crescimento</h2>\r\n"
				+ "<p>Mentalidade de crescimento é a crença de que você pode melhorar ao longo do tempo com a prática.</p>\r\n"
				+ "\r\n" + "<h2>Persistência</h2>\r\n"
				+ "<p>Uma mentalidade persistente vê desafios como algo que você pode superar, o que significa que alguém que incorpora persistência identifica desafios e rapidamente trabalha para buscar soluções.</p>\r\n"
				+ "\r\n" + "<h2>Trabalho em Equipe</h2>\r\n"
				+ "<p>Trabalho em equipe é a habilidade comportamental que faz um grupo de pessoas trabalhar juntas com um objetivo comum.</p>"
				+ "<h2>Atenção aos Detalhes</h2>\r\n"
				+ "<p>Alguém que possui a habilidade de atenção aos detalhes é como uma pessoa que percebe as partes mínimas de uma tarefa ou situação para que possa concluir um trabalho que lhe foi atribuído com total precisão e eficiência.</p>"
				+ "<h2>Proatividade</h2>\r\n"
				+ "<p>Proatividade é assumir a liderança ou responsabilidade de um trabalho, ser proativo(a) também é procurar maneiras para contribuir ou ajudar no trabalho de outras pessoas.</p>"
				+ "<h2>Comunicação</h2>\r\n"
				+ "<p>Uma boa comunicação depende tanto do/da falante quanto do/da ouvinte, ouvintes podem influenciar de forma positiva o êxito da conversa tanto quanto os/as falantes.</p>"
				+ "<h2>Orientação ao Futuro</h2>\r\n"
				+ "<p>Orientação ao futuro não se trata apenas de definir metas, mas de pensar sobre\r\n"
				+ "como suas ações no presente podem afetar suas chances de atingir suas metas\r\no futuro.</p>";
	}

	@GetMapping("/aprendendo")
	public String aprendendo() {
		return "<h2>Plano de aprendizagem focando no hoje</h2>\r\n"
				+ "<p>Estou buscando aprimorar minha comunicação para alcançar meus objetivos de desenvolvimento como desenvolvedor Full Stack Java. Acredito que aprimorar minhas habilidades de comunicação é essencial para alcançar sucesso em minha carreira e pretendo praticá-las continuamente.</p>\r\n"
				+ "\r\n" + "<h2>Recursos de aprendizagem</h2>\r\n"
				+ "<p>Para aprimorar minha comunicação, estou investindo em treinamento constante, aplicando técnicas de comunicação e buscando feedbacks para entender áreas em que preciso melhorar. Acredito que a prática regular e a busca por feedbacks são essenciais para desenvolver minhas habilidades de comunicação como desenvolvedor Full Stack Java.</p>";

	}
}
