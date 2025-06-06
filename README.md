# Conversor de Moedas - Projeto Java

## Descrição

Neste emocionante desafio de programação, você vai construir um Conversor de Moedas em Java, com interação via console. O projeto faz requisições a uma API de taxas de câmbio em tempo real, manipula dados JSON e exibe as conversões das moedas de interesse.

O objetivo é criar um menu interativo com no mínimo 6 opções diferentes de conversão, utilizando taxas dinâmicas obtidas via API para garantir dados atualizados e precisos.

## Funcionalidades

- Menu textual no console com opções de conversão entre diferentes moedas (USD, BRL, ARS, COP, etc.).
- Consumo de API externa para obter taxas de câmbio em tempo real.
- Processamento da resposta JSON para extrair as taxas de conversão.
- Exibição clara e formatada do resultado para o usuário.

## Como usar

1. Clone este repositório.
2. Importe o projeto no Eclipse (ou sua IDE Java preferida).
3. Instale a biblioteca **Gson** manualmente:
   - Baixe o JAR do Gson em: [https://repo1.maven.org/maven2/com/google/code/gson/gson/](https://repo1.maven.org/maven2/com/google/code/gson/gson/)
   - Adicione o JAR à biblioteca do projeto (`Build Path` > `Add External JARs...`).
4. Execute a classe principal (`progama.Principal`).
5. Interaja pelo menu no console escolhendo as opções de conversão desejadas.

## Organização do projeto

O projeto está dividido em pacotes:

- `requisicao` — classes responsáveis pela requisição HTTP e manipulação da resposta.
- `interacao` — classes para interação com o usuário via console.
- `Conversao` — lógica de conversão e fluxo principal do programa.
- `progama` — classe principal que inicia a aplicação.

## Dicas

- Certifique-se de ter conexão com a internet para que as requisições à API funcionem corretamente.
- Caso encontre erros na requisição, verifique a URL da API e seu token de acesso (se necessário).
- Utilize a versão mais recente do Java compatível com o projeto.
