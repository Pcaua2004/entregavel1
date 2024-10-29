# API de Operações Matemáticas
![exemplo](https://github.com/user-attachments/assets/480d482d-4e63-4ae9-9e71-02792af1661f)

## Tecnologias Utilizadas
- Node.js
- Express
- Body-parser

## Configuração do Projeto

1. Clone o repositório.
2. Instale as dependências do projeto executando os seguintes comandos no terminal:
   ```bash
   npm init -y
   npm install express body-parser
   ```
3. Inicie o servidor executando o comando:
   ```bash
   node app.js
   ```

4. A aplicação estará disponível em: `http://localhost:3001/`.

## Rotas da API

- `/` (GET) - Retorna uma mensagem de boas-vindas.
- `/soma` (POST) - Retorna a soma de dois números.
- `/subtrai` (POST) - Retorna a subtração de dois números.
- `/multiplica` (POST) - Retorna a multiplicação de dois números.
- `/divide` (POST) - Retorna a divisão de dois números (ou um erro se o divisor for 0).

## Testando com Postman

1. Selecione o método POST.
2. No corpo da requisição, escolha a opção **raw** e o formato **JSON**.
3. Exemplo de JSON para testar:
   ```json
   {
     "a": 5,
     "b": 10
   }
   ```
