# Desafio 04 – Tipos de Dados

Nesta questão, foi buscado comparar três linguagens conhecidas e diferentes entre si: Java, C e Python. A análise envolve aspectos como tipagem estática vs dinâmica, tipagem forte vs fraca, declarações de variáveis e o comportamento da linguagem em tempo de execução.

---

## Conceitos

### Tipagem Estática vs Dinâmica

- **Estática**: o tipo de uma variável é verificado em tempo de compilação. Exemplo: Java, C.
- **Dinâmica**: o tipo é determinado e verificado em tempo de execução. Exemplo: Python.

### Tipagem Forte vs Fraca

- **Forte**: não permite conversões automáticas entre tipos incompatíveis sem aviso.
- **Fraca**: permite conversões implícitas, o que pode gerar comportamentos inesperados.

### Checagem

É o momento em que a linguagem verifica se os valores atribuídos às variáveis ou passados como argumentos estão conformes com os tipos esperados.

#### Tipos de checagem

- **Estática:** A verificação acontece em tempo de compilação. Erros de tipo são detectados antes do programa rodar.
- **Dinâmica:** A verificação ocorre em tempo de execução. O tipo das variáveis pode mudar e os erros aparecem durante a execução.
### Declaração de tipo

Refere-se à necessidade (ou não) de declarar explicitamente o tipo de uma variável no momento da sua criação.

- **Obrigatória (Explícita):** O programador deve especificar o tipo da variável.
- **Opcional (Inferência):** A linguagem deduz o tipo automaticamente com base no valor atribuído.

Exemplo

```
int x = 5; \\declaração de tipo obrigatória
```

```
x = 5 \\ a partir dessa declaração, a lingaugem deduz o tipo
```
### Conversões Implicítas

São as transformações automáticas que a linguagem faz entre tipos diferentes durante a execução de uma operação.

Exemplo
```
  int x = 1;
  int y = 5 //exemplo de declaraçaõ explícita
  float resultado = y/x; //exemplo de declaração implicita, conversão de int para float
```
---

## Tabela Comparativa 
![tabelacomparativa](tabela2.png)

---

## Linguagens

### Java

```
public class TipoJava {
    public static void main(String[] args) {
        int numero = 10;
        double resultado = numero / 3; // Conversão automática de int para double
        System.out.println(resultado);

        String texto = "10";
        // int erro = texto; // Erro de compilação: tipos incompatíveis
    }
}
```
- A tipagem é verificada em tempo de compilação.
- Atribuições incorretas geram erro antes da execução.

### C
```
#include <stdio.h>

int main() {
    int numero = 10;
    float resultado = numero / 3;  // Resultado: 3.0 (int/int = int (convertido em float))
    printf("%f\n", resultado);

    int x = "123";  // Compila mas comportamento é indefinido (conversão implícita inválida)
    printf("%d\n", x);
    return 0;
}
```
-  C permite conversões implícitas arriscadas, inclusive entre tipos completamente incompatíveis
-  Pode causar comportamentos indefinidos sem alertas do compilador padrão.

### Python
```
numero = 10
resultado = numero / 3  # Resultado: 3.333..., divisão real
print(resultado)

texto = "10"
# erro = texto + 5  # TypeError: não é possível somar string com int

```
- Python detecta erros de tipo em tempo de execução.
- Não permite operações ambíguas sem conversão explícita
  
---

##  Conclusão

A comparação entre Java, C e Python evidencia como diferentes linguagens tratam os tipos de dados com abordagens específicas:

- Java: impõe uma tipagem estática e forte, garantindo segurança em tempo de compilação e impedindo erros de coerção automática.
- C: é estática e fraca, permitindo conversões implícitas perigosas, que podem gerar comportamentos inesperados.
- Python: adota uma tipagem dinâmica e forte, permitindo maior flexibilidade, porém com validação em tempo de execução.

Compreender essas diferenças é essencial para escolher a linguagem mais adequada a um projeto, garantindo robustez, desempenho ou produtividade, conforme o contexto.
