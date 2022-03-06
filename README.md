# Lista-java1

### Lista de atividades java.
<p>
1. Fazer um programa que imprima os números pares que existem no intervalo entre 1
e 15.
</p>
<p>
2. Fazer um programa que imprima na tela o somatório dos números de 0 a 10.
</p>
<p>
3. Fazer um programa que imprima na tela a média dos números ímpares que estão no
intervalo entre 0 e 100.
</p>
<p>
4. Fazer um programa que exiba a janela de diálogo três vezes, em cada uma delas o
usuário irá entrar com um número inteiro. Após isso o programa deverá imprimir na tela o
somatório dos valores.
</p>
<p>
5. Fazer um programa para calcular o Índice de Massa Corporal. O programa deverá
exibir a janela de diálogo duas vezes, na primeira vez o usuário deverá fornecer o peso e na
segunda a altura. Em seguida, o programa deverá imprimir na tela o valor do IMC. A fórmula de
cálculo do IMC é peso/(altura*altura).
</p>
<p>
6. Fazer um programa que o usuário entre com uma frase e o programa imprima na tela
a frase com todos os caracteres em maiúsculo.
</p>
<p>
7. Fazer um programa que o usuário entre com o seu nome completo e o programa
exiba na tela apenas o primeiro e último nome. Exemplo: para a entrada de nome "Ana Maria de
Souza", o programa deverá imprimir na tela "Ana Souza".
Dicas:

- **a classe String possui o método split(separador). Ele retorna um vetor de String, onde
cada elemento desse vetor irá possuir um pedaço da String de entrada. A String é
separada usando a String separador, por exemplo:**
  
  - String entrada = "1;2;3;4";
  
  - String[] vet = entrada.split(";"); //neste exemplo, separador é ";"
  
  - a variável vet terá os seguintes elementos: "1", "2", "3" e "4".
para acessar o primeiro elemento (posição zero) de um vetor vet usamos vet[0] e para acessar o
último podemos usar vet[vet.length-1]. A propriedade length possui a quantidade de elementos
do vetor.
</p>
