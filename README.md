# Hello-World

Hello Word
Este é um breve guia sobre como executar a aplicação Spring Boot do projeto.

## Explicado o Desafio

**Imagine que você é um desenvolvedor em uma startup de tecnologia inovadora. Sua equipe está construindo um novo serviço web e precisa garantir que a infraestrutura esteja configurada corretamente para lidar com solicitações HTTP e responder com dados JSON.**

**Tarefa:** *Seu desafio é criar uma API RESTfull simples que retorne um objeto JSON com a chave “mensagem” e o valor “Olá, Mundo!” quando acessada via GET na rota raiz (“/”). Você tem a liberdade de escolher a tecnologia que desejar para implementar esta API.*

**Entrega:** *Forneça o link do repositório no forms: https://forms.gle/FDdj1s6v6nRG5YQi9 e informe o passo a passo para executar o seu código !*

**Avaliação:** *Seu trabalho será avaliado com base na precisão (o código faz o que deveria fazer?), organização/clareza do código.*

## Pré-requisitos
Certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

Git
Java Development Kit (JDK)
Maven

## Clonando o Repositório
Abra o terminal e execute o seguinte comando para clonar o repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git

## Importando na IDE
Abra sua IDE (recomendamos o uso do Eclipse), e importe o projeto como um projeto Maven existente.

verifique também as dependencias estão tudo certo. Depedencias usadas:

~~~
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		
		<dependency>
		    <groupId>org.json</groupId>
		    <artifactId>json</artifactId>
		    <version>20231013</version>
		</dependency>
~~~

# Executando a Aplicação
Navegue até a classe principal do aplicativo (geralmente, uma classe anotada com @SpringBootApplication).
Execute a aplicação clicando com o botão direito na classe principal e escolhendo "Run" ou "Debug".
A aplicação Spring Boot será iniciada e estará disponível em http://localhost:8080.

## Testando a Aplicação
Abra um navegador da web e acesse http://localhost:8080 para verificar se a aplicação está em execução corretamente.
