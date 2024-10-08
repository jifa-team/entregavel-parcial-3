
# Entregável Parcial 3

Esse repositório representa a 3ª Sprint do Projeto, e tem por objetivo a confecção das classes, usando a linguagem <img src="https://cdn3.emoji.gg/emojis/java.png" width="32px" height="32px" alt="java"></a>. As classes materializarão regra de negócio a ser desenvolvida, no nosso caso, um sistema de agendamento para o uma clínica odontólogica.

## Equipe Responsável pela execução do Projeto

- Adão Eduardo Gomes de Oliveira | Matricula: 2023010692
- Alexandra Silva de Paula | Matrícula: 2023018832
- Carlos Eduardo de Lima Lira Santana | Matrícula: 2023010629
- Gustavo Ferreira Reinaldo | Matricula: 2023010997
- Sayonara Arcanjo da Silva | Matrícula: 2023011107

## Demonstração - Vídeo explicativo

https://github.com/user-attachments/assets/b2c9f3c8-564c-46f1-8adb-fcf90a77d9d7

## Estrutura do Projeto

  

```js

ep3/

├── lib/

├── src/

│          ├── app/

│         ├── controller/

│         ├── model/

│         ├── repository/

│         └── service/

├── .gitignore

└── README.md

```
### O que cada parte faz:

**lib:**

**src.app:** Contém a classe principal da aplicação, que é a entrada inicial para a execução do programa.

**src.controller:** Contém as classes responsáveis pelo gerenciamento das solicitações do usuário e pela coordenação das respostas. Os controladores recebem as requisições, interagem com os serviços e retornam as respostas apropriadas.

**src.team.jifa.model:** Contém as classes que representam o modelo de dados do aplicativo. Estas são as entidades que serão manipuladas pela aplicação, muitas vezes refletindo a estrutura das tabelas no banco de dados.

**src.team.jifa.repository:** Contém as classes responsáveis pela comunicação com o banco de dados. Estas classes gerenciam operações CRUD (Create, Read, Update, Delete) e consultas específicas para cada entidade.

**src.team.jifa.service:** Contém as classes que implementam a lógica de negócios da aplicação. Estas classes são responsáveis por processar dados, aplicar regras de negócios e realizar operações mais complexas que podem envolver múltiplos repositórios ou entidades.

**.gitignore:**
  

## Pré-requisitos

  

- Java Development Kit (JDK) 8 ou superior

  

## Como Importar o Projeto

<img src="https://upload.wikimedia.org/wikipedia/commons/9/9c/IntelliJ_IDEA_Icon.svg" width="32px" height="32px" alt="IntelliJ Idea"> **IntelliJ IDEA**
  

 - Abra o IntelliJ IDEA
   
 - Clique em "File" > "Open"
   
  - Navegue até o diretório do projeto e selecione-o
   
  - Clique em "OK"
   
   O IntelliJ IDEA deve reconhecer automaticamente a estrutura do
   projeto Java

<img src="https://cdn3.emoji.gg/emojis/2434_EclipseIDE.png" width="32px" height="32px" alt="EclipseIDE"> **Eclipse**

- Abra o Eclipse

- Clique em "File" > "Import"

- Escolha "General" > "Existing Projects into Workspace"

- Selecione o diretório raiz do projeto

- Clique em "Finish"

  

<img src="https://cdn3.emoji.gg/emojis/9540-vscode.png" width="32px" height="32px" alt="VSCode"> **Visual Studio Code**

- Abra o Visual Studio Code

- Clique em "File" > "Open Folder"

- Navegue até o diretório do projeto e selecione-o

- Instale a extensão "Extension Pack for Java" se ainda não estiver instalada

O VS Code deve reconhecer automaticamente a estrutura do projeto Java

  

<img src="https://upload.wikimedia.org/wikipedia/commons/9/98/Apache_NetBeans_Logo.svg" width="32px" height="32px" alt="NetBeans"> **NetBeans**

- Abra o NetBeans

- Clique em "File" > "Open Project"

- Navegue até o diretório do projeto e selecione-o

- Clique em "Open Project"

  

## Configuração Adicional

Se o projeto não for reconhecido automaticamente como um projeto Java, você pode precisar configurar manualmente o diretório de origem:

  - Localize as configurações do projeto na sua IDE

- Defina a pasta src como diretório de origem (source directory)


## Licença

Você pode visualizar a licença do projeto [aqui](LICENSE.txt).
