#language: pt
#Author: islansantosbz@gmail.com

@regressivos
Funcionalidade: Login na plataforma saucedemo
  Como um usuário do site saucedemo
  Quero enviar as minhas credenciais 
  Para acessar a página de usuário logado

Contexto: Acessar o formulário de login
  Dado que o usuário acessa a página de login

@loginPositivo
Cenário: Login com sucesso
  Quando preencher o username "standard_user" e a senha "secret_sauce" corretamente
  Então valida o usuario logado

@loginNegativo
Cenário Outline: Login com credenciais inválidas
  Quando preencher o <username> e a <senha> incorretamente
  Então valida a mensagem com a inconsistência "<mensagem>"

  Exemplos:
    | email                   | senha   | mensagem          |
    |                         |         | Dados em branco   |
    | islansantosbz@gmail.com | errada  | Senha errada      |
    | errodo@gmail.com        | errada  | Email errado      |
