# OnSafety
Processo seletivo<br>

ESPECIFICAÇÕES<br>

A aplicação consiste em uma API REST, com os dados persistidos em um banco de dados com <br>
interface que permita o CRUD dos registros.<br>
A aplicação deve ser capaz de auto configurar sua base na inicialização, ou deve conter um <br>
README com os passos necessários para sua execução correta. <br>
Incluir ao menos uma validação na interface, uma na API e uma no banco de dados; <br>
Validar e formatar CPF;<br>
Obrigatória a utilização do Spring Boot no backend e banco de dados MySql.<br>
Interface pode ser web ou mobile, com frameworks de livre escolha do programador.<br>

Para rodar a aplicação é necessário que esteja instalado em sua máquina o Maven e o MySQL! <br>

Configuração do Banco de Dados:<br>
1 --> Depois de efetuar o clone deste projeto, entre na pasta OnSafety > src > main > application.properties <br>
2 --> para configurar o seu MySQL digite o nome do seu usuario em "spring.datasource.username= <  DIGITE O SEU USUARIO >"  <br>
3 --> depois informe a senha do seu banco em "spring.datasource.password= < DIGITE A SUA SENHA > "  <br>


1 --> Faça o clone do projeto: "git clone https://github.com/PatriciaRuffino/OnSafety.git"<br>
2 --> entre na pasta OnSafety e execute o comando " mvn clean install", para criar a pasta target <br>
3 --> entre na pasta target e execute o comando "java -jar ms-employee-0.0.1-SNAPSHOT.jar" <br>
4 --> Abra o browser e digite "http://localhost:8080/home" no seu navegador. <br><br>

Ao entrar nesta tela, clique em "Adicionar pessoa" para ser redirecionado para a tela de formulário. <br>
<img src="https://user-images.githubusercontent.com/65633304/190898717-af2e78f7-b6ca-4419-812c-ad89fe11207e.png" style="width:700px"><br> <br>

Preencha os dados, mas atenção em digitar um CPF válido.
<img src="https://user-images.githubusercontent.com/65633304/190899092-c67f4b82-2df6-4b6c-8484-4c2353ecafeb.png" style="width:700px"> <br>

O icone de lápis é para editar dados e a lixeira é para excluir o cadastro.<br>
<img src="https://user-images.githubusercontent.com/65633304/190898910-10efc595-31df-45a4-89df-48eb4ab4dfa8.png" style="width:700px"> <br>

API: A documentação da API está disponível em "http://localhost:8080/swagger-ui.html".  



