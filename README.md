# E-Commerce Java

Projeto da mentoria do [PAQ](https://github.com/paq-devs) para fins de estudo e evoluçao do educando [Davi](https://github.com/zanotta23). Para este projeto criamos uma estrutura para um ecommerce focado em venda de roupas, cuja API será feita em Java e o front-end com Next.js e React.

## Arquitetura

- Banco
	- MySql
- Back-end (API)
    - [Java Jetty](https://eclipse.dev/jetty/documentation/current/)
	- Compartilhar servidor com [Ngrok](https://ngrok.com/)
- Front-end
	- [Next.js](https://nextjs.org/) / [React](https://react.dev/)
	- [React Bootstrap](https://react-bootstrap.netlify.app/docs/components/navbar)

## Funcionalidades

- [ ] Listar todos os produtos
- [ ] Carregar detalhes de um produto
    - [ ] Adicionar produto ao carrinho de compras
    - [ ] Finaliza a compra
- [ ] Tela de login
    - [ ] Cadastro do comprador
- Back-office
    - [ ] Login de administrador
    - [ ] Acesso a tela de pedidos
    - [ ] Controle de estoque
    - [ ] Relatórios de vendas