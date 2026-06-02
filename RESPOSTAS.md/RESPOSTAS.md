# Respostas Teóricas – Fila Genérica

## 1) Vantagem de usar Fila<T> em vez de classes específicas

Usando uma única classe genérica `Fila<T>`, escrevemos o código uma só vez
e reutilizamos para qualquer tipo. Se criássemos `FilaCliente`, `FilaChamado`
e `FilaPedido` separadamente, teríamos três classes com código idêntico,
dificultando a manutenção — uma correção precisaria ser feita em três lugares.
Com `Fila<T>`, corrigimos em um único lugar e todas as filas se beneficiam.

## 2) Como Generics contribuem para Type Safety

Os tipos genéricos garantem segurança em tempo de compilação: ao declarar
`Fila<Cliente>`, o compilador impede que objetos de outro tipo (como `Pedido`)
sejam adicionados por engano. Sem generics, o compilador não detectaria esse
erro, que só apareceria em tempo de execução como um `ClassCastException`.

## 3) O que aconteceria com ArrayList<Object>

Se usássemos `ArrayList<Object>`, qualquer tipo de objeto poderia ser
adicionado à mesma fila sem restrição, perdendo a segurança de tipos.
Além disso, ao recuperar um elemento seria necessário fazer casting manual
(por exemplo, `(Cliente) fila.proximo()`), o que é arriscado e pode causar
`ClassCastException` em tempo de execução se o tipo estiver errado.
Com `ArrayList<T>`, o compilador já garante que os tipos estão corretos.