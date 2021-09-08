Feature: Todos os departamentos -  Produtos

@CT02_BuscaProdutoIphone
  Scenario: Valida Busca produto
    Given que estou na tela principal da home
     And pesquiso pelo produto Iphone
     When clico no botão buscar
     Then será exibido todos os Iphone da lista cadastrados

@CT03_ProdutoCarrinho
  Scenario: Valida produto no Carrinho
     Given que escolho produto iphone xr 64gb preto, 4g, tela de 6.1 que está na página de "TODOS OS DEPARTAMENTOS"
     And no botão "COMPRAR"
     And é exibida a mensagem "Produto adicionado no carrinho"
     When clico no carrinho
     Then o produto "iphone xr 64gb preto" será exibido no carrinho com sucesso.
