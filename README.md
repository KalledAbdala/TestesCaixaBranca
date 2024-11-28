# TestesCaixaBranca
*Exercício individual - Tema: Testes Caixa Branca*

# --ETAPA 1--
**Erro 1 / Linha 8**

    • Erro : Main class User could not be found or loaded.
    • Explicação - Ausência do método main, o Java exige que haja um método principal (public static void main(String[] args)) para iniciar a execução do programa.

**Erro 2 / Linha 15**

    • Erro : Driver do MySQL
    • Explicação - O driver especificado no método Class.forName é "com.mysql.Driver.Manager", o que é incorreto.

**Erro 3 / Linha 16**

    • Erro : URL de Conexão
    • Explicação - É necessário incluir a configuração de timezone e desabilitar SSL, dependendo da configuração do MySQL.

**Erro 4 / Linha 34**

    • Erro : String SQL no Método verificarUsuario
    • Explicação - O comando SQL inicial contém um erro de sintaxe: "select none from usuarios".

**Erro 5 / Linhas 31-33**

    • Erro : SQL Injection
    • Explicação - A construção do comando SQL concatena diretamente os valores login e senha, o que é uma vulnerabilidade de SQL Injection. Exemplo de ataque possível: Alguém pode inserir admin' OR '1'='1 no campo login, o que permitirá acesso indevido.
    
**Erro 6 / Linha 47**

    • Erro : Conexão Não Fechada
    • Explicação - O método verificarUsuario não fecha a conexão com o banco de dados após o uso. Isso pode levar ao esgotamento de recursos e problemas de desempenho.
    
**Erro 7 / Linhas 18 e 47**

    • Erro : Tratamento de Exceções
    • Explicação - O bloco catch (Exception e) não faz nada com a exceção capturada, o que dificulta a depuração do código.

**Erro 8 / Linha 20**

    • Erro : Campos Públicos Não Encapsulados
    • Explicação - Os campos nome e result são públicos, o que viola o princípio de encapsulamento. Devem ser privados e acessados através de métodos getters e setters.

# --ETAPA 2--

**Arquivo adicionado no projeto "PLANO DE TESTE-CAIXA BRANCA.xlsx"**
*https://github.com/KalledAbdala/TestesCaixaBranca/blob/main/PLANO%20DE%20TESTE-CAIXA%20BRANCA.xlsx*

# --ETAPA 3--
# --ETAPA 4--
