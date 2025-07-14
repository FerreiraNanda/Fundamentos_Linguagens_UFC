
# Desafio 02 – Ambientes de Programação

Este desafio propõe a compreensão detalhada dos três principais ambientes de execução de linguagens de programação: **Compiladores**, **Interpretadores** e **Máquinas Virtuais**. A seguir, são apresentados seus fluxos completos, com explicação textual do funcionamento de cada ambiente e da função de cada componente representado nos diagramas.

---

## Compilador

O **compilador** é um sistema que transforma o código-fonte completo de uma linguagem de programação em **código de máquina (binário executável)**. Após essa tradução, o executável pode ser executado diretamente pelo sistema operacional, sem necessidade do código-fonte original.

### Etapas do compilador e suas funções:

1. **Código Fonte**  
   Bloco inicial onde o programador escreve as instruções na linguagem de alto nível (ex.: C).

2. **Análise Léxica**  
   Quebra o código-fonte em **tokens** (palavras-chave, identificadores, operadores etc.).

3. **Análise Sintática**  
   Valida a **estrutura gramatical** do código (ex.: se um `if` está com parênteses e chaves corretos), gerando uma **árvore sintática abstrata (AST)**.

4. **Análise Semântica**  
   Verifica o **significado das estruturas**: se variáveis foram declaradas, se tipos são compatíveis, se há conflitos de escopo.  
   Utiliza a **Tabela de Símbolos** para armazenar dados sobre variáveis, funções, tipos e escopos.

5. **Geração de Código Intermediário**  
   Converte a AST em uma forma intermediária independente de plataforma.

6. **Otimização de Código**  
   Melhora a eficiência do código intermediário, eliminando redundâncias ou reorganizando instruções.

7. **Geração de Código Final**  
   Converte o código intermediário em **código de máquina nativo**, criando um executável.

8. **Código de Máquina Alvo**  
   Arquivo binário final, pronto para ser executado diretamente no sistema operacional.

9. **Tabela de Símbolos**  
   Estrutura auxiliar consultada e atualizada pelas etapas de análise, contendo informações semânticas dos elementos do código.

### Diagrama

![Compilador](compilador.png)

---

## Interpretador

O **interpretador** é um sistema que **lê, analisa e executa o código-fonte linha por linha**, sem gerar um arquivo executável. É muito utilizado para scripts, automação e testes, pois permite execução imediata.

### Etapas do interpretador e suas funções:

1. **Código Fonte**  
   Contém as instruções escritas pelo programador em uma linguagem interpretada (ex.: Python).

2. **Análise Léxica**  
   Quebra o código em tokens da mesma forma que o compilador.

3. **Análise Sintática**  
   Constrói a árvore sintática e valida a estrutura gramatical do código.

4. **Análise Semântica**  
   Verifica coerência lógica (tipos, escopos, nomes) com apoio da **Tabela de Símbolos**.

5. **Execução Linha a Linha**  
   Em vez de gerar código, o interpretador **executa cada linha diretamente**, conforme vai sendo analisada.

6. **Sistema Operacional**  
   As chamadas executadas pelo interpretador (ex.: print, leitura de arquivos) interagem diretamente com o sistema.

7. **Tabela de Símbolos**  
   Usada dinamicamente durante a análise e execução para registrar variáveis e seus valores.

### Diagrama

![Interpretador](interpretador.png)

---

## Máquina Virtual

A **máquina virtual (VM)** atua como um ambiente intermediário entre o código-fonte e a máquina real. Nesse modelo, o código é **compilado para um formato intermediário (bytecode)**, que é executado por uma VM, garantindo **portabilidade entre plataformas**.

### Etapas da máquina virtual e suas funções:

1. **Código Fonte**  
   Código original escrito em uma linguagem como Java, Kotlin ou C#.

2. **Análise Léxica**  
   Converte o código em tokens.

3. **Análise Sintática**  
   Valida a estrutura gramatical da linguagem.

4. **Análise Semântica**  
   Verifica tipos, escopos, declarações, acessando a **Tabela de Símbolos**.

5. **Geração de Bytecode**  
   Diferente do compilador tradicional, a saída aqui é um **bytecode portátil**, como `.class` (Java) ou `.dll` (C#).

6. **Máquina Virtual (JVM / CLR)**  
   Interpreta ou compila em tempo de execução o bytecode, gerando instruções de máquina que são enviadas ao sistema operacional.

7. **Sistema Operacional**  
   Executa as instruções processadas pela máquina virtual.

8. **Tabela de Símbolos**  
   Armazenamento auxiliar de informações sobre variáveis, tipos e escopos, utilizada pela análise semântica.

### Diagrama

![Máquina Virtual](mv.png)
