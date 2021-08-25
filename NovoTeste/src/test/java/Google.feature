Feature: Pesquisa google
  How usuário
  And quero usar a pesquisa do google
  For verificar os sites relacionados ao tema "dorama".

@PesquisaValidaNoGoogle
  Scenario: Pesquisa válida no google
    Given  que estou na página princial de pesquisa do google
    And digito a palavra "dorama"
    When clico no botão pesquisar
    Then será exibido a lista de páginas sobre doramas.

@TesteErroNoGoogle
Scenario: Pesquisa inválida no google
  Given que estou na página princial de pesquisa do google
  And não informo nenhum dado na pesquisa
  When clico no botão pesquisar
  Then o botão está desabibilitado e não trará resultado em tela.