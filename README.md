# E-Commerce Java

Projeto para estudos sobre eCommerce focado em venda de roupas, feito em Java.

## Arquitetura

- Banco
	- MySql
- Java Web Server (API) ver como implementar API em Java
	- compartilhar servidor com localtunel ou similares
- Front (consome API)
	- React(?)
	- https://react-bootstrap.netlify.app/docs/components/navbar

## Funcionalidades

- listar produtos
- detalhe de um produto
    - adicionar ao carrinho
    - finaliza a compra
- login
    - cadastro do comprador
- tela de pedidos
- login de administrador
    - backstage
        - controle de estoque
            - venda -> atualizar estoque (saída)
            - compra -> atualizar estoque (entrada)
        - relatórios de vendas