# 💼 Employee Calculator

Um programa em Java que gerencia informações de funcionários, calcula salário líquido e aplica aumentos salariais.

## 🚀 Funcionalidades

O programa realiza as seguintes operações:

1. Solicita ao usuário os dados do funcionário:
   - Nome
   - Salário Bruto
   - Impostos (Tax)
2. Calcula e exibe o **salário líquido** (bruto - impostos)
3. Permite aumentar o salário por um percentual especificado
4. Exibe os dados atualizados do funcionário

## 📋 Exemplo de Uso

### Entrada
```
Name: John Doe
Gross Salary: 5000.00
Tax: 1000.00
Which percentage to increase salary: 10
```

### Saída
```
Employee: John Doe, $4000.00

Updated data: John Doe, $4400.00
```

## 📁 Estrutura do Projeto

```
src/
├── application/
│   └── Program.java
└── entities/
    └── Employee.java
```

## 🔧 Classe Employee

A classe `Employee` contém os seguintes atributos e métodos:

```java
public class Employee {
    public String name;              // nome do funcionário
    public double grossSalary;       // salário bruto
    public double tax;               // impostos
    
    public double netSalary() { ... }           // retorna o salário líquido
    public void increaseSalary(double percentage) { ... }  // aumenta o salário
    public String toString() { ... } // retorna as informações formatadas
}
```

### Métodos

- **`netSalary()`**: Retorna o salário líquido (salário bruto - impostos)
- **`increaseSalary(percentage)`**: Aumenta o salário bruto pelo percentual informado
- **`toString()`**: Retorna uma string formatada com o nome e salário líquido

## ▶️ Como Executar

### No terminal (Windows/Linux/Mac)

```bash
javac src/application/Program.java src/entities/Employee.java
java -cp src application.Program
```

Ou, se usando um IDE como Eclipse ou IntelliJ, basta executar a classe `Program.java` diretamente.

## 📌 Observações Importantes

- O programa utiliza `Locale.US` para garantir o uso do **ponto** como separador decimal
- Os valores são exibidos com **duas casas decimais**
- O programa aceita valores decimais como entrada
- O aumento salarial é calculado sobre o **salário bruto** atual

## 💡 Fórmulas Utilizadas

- **Salário Líquido**: `SL = Salário Bruto - Impostos`
- **Aumento Salarial**: `Novo Salário = Salário Bruto + (Salário Bruto × Percentual / 100)`

## 📊 Fluxo de Execução

1. Usuário insere nome, salário bruto e impostos
2. Sistema exibe os dados do funcionário com salário líquido
3. Usuário informa percentual de aumento
4. Sistema atualiza o salário bruto e exibe os novos dados

---

**Desenvolvido em Java** ☕
