
# language: pt
# encoding: utf-8

  Funcionalidade: Pesquisar produto no site

  @cenario1
  Cenario: Realizar pesquisa de um produto
    Dado que eu acesse o site do ecommerce
    Quando eu clicar no icone da lupa e digitar o nome do produto desejado
    Então certifico que consegui achar o produto

  @cenario2
  Cenario: Incluir produtos no carrinho
    Dado que eu acesse o site do ecommerce
    Quando eu pesquisar o produto e clicar no botão para adicionar no carrinho
    Então certifico que o produto foi adicionado com sucesso no carrinho


  @cenario3
  Cenario: Remover produto do carrinho
    Dado que eu acesse o site do ecommerce
    Quando eu acessar o carrinho e clicar em remove
    Então certifico que o produto foi removido do carrinho
