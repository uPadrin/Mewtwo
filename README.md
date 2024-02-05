<h1 align="center">Hackathon - AsapCard</h1>

###

<br clear="both">

<div align="center">
  <img src="https://ik.imagekit.io/padrin/Design%20sem%20nome%20(2).png?updatedAt=1707082836873"  />
</div>

###

<h1 align="center">Projeto</h1>

###

<br clear="both">

<p align="center">O projeto consiste em construir uma aplicação que realize a conversão de arquivos com a extensão ".csv" para Json, implementando o conceito de "fila de mensagens" com RabbitMQ, publicando esses dados assim permitindo ser consumidos por outra aplicação, com o objetivo de persisti-los no Banco de Dados.</p>

###

<h3 align="center">Back-End</h3>

###

<p align="center">Para a criação do Back-End utilizamos conceitos de orientação a objeto com Java, buscando cumprir o objetivo do desafio proposto.</p>

###

<h3 align="center">Stacks utilizadas</h3>

###

<div align="center">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" height="40" alt="java logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" height="40" alt="spring logo"  />
  <img width="12" />
  <img src="https://cdn.simpleicons.org/rabbitmq/FF6600" height="40" alt="rabbitmq logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" height="40" alt="docker logo"  />
  <img width="12" />
  <img src="https://dbdb.io/media/logos/h2-logo.svg" height="40" alt "H2DB logo">
  <img width="12" />
</div>


<h2 align="left"></h2>
<h2 align="left">Testes das Aplicações</h2>
<h4 align="left">Adicionando o projeto no repositório local</h4>
<p align="left">
  1 - Crie uma pasta no local de sua preferencia.
  <br>
  2 - Clique com o botão direito do mouse e abra o seu terminal, em seguida insira o seguinte comando  "git clone https://github.com/uPadrin/Mewtwo.git".
  <br>
  3 - Acesse o diretório devops no projeto SendMessage e execute o docker.
  <br>
  4 - Em seguida abra sua IDE de preferencia e selecione os projetos "sendMessage" e "cardProcessor".
  <br>
  5 - Rode o comando mvn clean install nos dois projetos;
  <br>
  6 - Execute o programa sendMessage para fazer a leitura, conversão e envio dos dados para a fila Rabbitmq. (Você pode conferir o envio através do RabbitMq utilizando usuario: guest e senha: guest)
  <br>
  7 - Em seguida, execute o projeto CardProcessor para fazer o recebemineto dos dados da fila. Os dados apenas serão exibidos no console.
  <br>
   - A partir desse ponto, ele somente cria as tabelas com as colunas, e faz um log das mensagens. O projeto ainda se encontra em andamento. 🔧
</p>


<h4 align="left">Membros da equipe</h4>
<table>
  <tr>
    <td align="center">
      <a href="https://github.com/uPadrin">
        <img src="https://github.com/uPadrin.png" width="100px;"/><br>
          <b>Bryan Vieira</b>
        </a>
    </td>
    <td align="center">
      <a href="https://github.com/LeoDuarte37">
        <img src="https://github.com/LeoDuarte37.png" width="100px;"/><br>
          <b>Leonardo Duarte</b>
      </a>
    </td>      
      <td align="center">
      <a href="https://github.com/nathanccoelho">
        <img src="https://github.com/nathanccoelho.png" width="100px;"/><br>
        <b>Natha Coelho></b>
      </a>
    </td> 
      <td align="center">
      <a href="https://github.com/mcs-vinicius">
        <img src="https://github.com/mcs-vinicius.png" width="100px;"/><br>
        <b>Vinicius Monteiro</b>
      </a>
    </td>
      <td align="center">
      <a href="https://github.com/Vitornasc3">
        <img src="https://github.com/Vitornasc3.png" width="100px;"/><br>
        <b>Vitor Nascimento</b>
      </a>
    </td>
        </td> 
</table>


