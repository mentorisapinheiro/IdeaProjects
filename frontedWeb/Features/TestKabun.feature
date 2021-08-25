Feature: Validando Site Kabum

@CT01_UsuarioInvalido
   Scenario: Usuário inválido
    Given que estou na página principal do site "https://kabum.com.br/"
    And clico no botão Login
    And informo os dados de acesso
    When clico no botão Entrar
    Then será exibido a mensagem "Dados inválidos, tente novamente!"

@CT02_BuscaProdutoIphone
    Scenario: Valida Busca produto
     Given que estou na tela principal da home
     And pesquiso pelo produto Iphone
     When clico no botão buscar
     Then será exibido todos os Iphone da lista cadastrados

 
@CT03_AdicionarProdutoDepartamentoNoCarrinho
    Scenario: valida adicionar produto no carrinho
     Given que estou na página de "TODOS OS DEPARTAMENTOS"
      And clico no produto "GiT Card Créditos para free fire"
      And clico no botão "COMPRAR"
      And é exibida a mensagem "PRODUTO ADICIONADO NO CARRINHO"
      When clico no carrinho
      Then valido o produto "GiT Card Créditos para free fire" no carrinho, valor "R$3,00 e quantidade 1.

