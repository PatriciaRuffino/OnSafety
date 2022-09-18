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
1 --> Faço o clone do projeto: "git clone https://github.com/PatriciaRuffino/OnSafety.git"<br>
2 --> entre na pasta OnSafety e execute o comando " mvn clean install", para criar a pasta target <br>
3 --> entre na pasta target e execute o comando "java -jar ms-employee-0.0.1-SNAPSHOT.jar" <br>
4 --> Abra o browser e digite "http://localhost:8080/home" no seu navegador. <br><br>
<img src="https://user-images.githubusercontent.com/65633304/190898717-af2e78f7-b6ca-4419-812c-ad89fe11207e.png" style="width:700px"><br> <br>
Ao entrar nesta tela, clique em "Adicionar pessoa" e digite os dados solicitados. PS: O CPF deve ser um número válido! <br>

