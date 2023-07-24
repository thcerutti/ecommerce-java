# eCommerce - API

O objetivo deste projeto é disponibilizar uma API REST para fornecer dados para o projeto de e-commmerce.

## Tecnologias utilizadas

- [Jetty](https://projects.eclipse.org/projects/rt.jetty)


## Rodando a API pelo Eclipse/VSCode

- Chamar o método `main` da classe `EcommerceWebserver`.
- No console aparecerá a URL e a porta onde o servidor está rodando.
- Abrir esta URL no browser.

## Fazendo o build e rodando pelo terminal

- `mvn clean package`: será gerado o build com as dependências
- `java -cp .\target\ecommerce-api-1.0-SNAPSHOT-jar-with-dependencies.jar com.ecommerce.EcommerceWebserver`: será chamado o método `main` da classe EcommerceWebserver, que subirá o servidor