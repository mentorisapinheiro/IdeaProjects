Feature: Validando Site Kabum

@CT01_UsuarioInvalido
   Scenario: Usuário inválido
    Given que estou na página principal do site "https://kabum.com.br/"
    And clico no botão Login
    And informo os dados de acesso
    When clico no botão Entrar
    Then será exibido a mensagem "Dados inválidos, tente novamente!"


