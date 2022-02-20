Criador: Izaque Farias
e-mail: zac_farias@hotmail.com

Instruções para execução dos programas:

*Para executar as questões, basta fazer o download dos arquivos .jar para uma pasta e através do prompt do Windows CMD executar o arquivo com o seguinte comando:

java -jar "nomeDoarquivo".jar 

-Lista de executáveis .jar(são 4 executáveis):

program_questao1.jar
program_questao2.jar 
program_questao2Auto.jar
program_questao3.jar

*A versão utilizada do Java é a "11.0.13" 2021-10-19 LTS
em caso de falha por incompatibilidade de versões, todo conteúdo do repositório pode ser clonado via gitHub e importado para uma IDE e assim executado. O IDE Eclipse foi utilizado para criar essa versão.


*Cada questão tem um arquivo correspondente ao seu número com exceção da questão 2, que possui dois arquivos, cada um ofertando uma solução diferenciada para o caso apresentado.

*Todas as soluções utilizam-se da classe Scanner onde o usuário pode realizar o imput dos dados.

***Questão 1 - (program_questao1.jar)
Através da classe Scanner o programa solicita a entrada de uma variável "n", que irá representar o número de degraus que será formada pela impressão das duas variáveis: espaco e asterisco, alternadas com o método repeat, dentro de um laço de repetição for. Um tratamento de exceções previne erros de InputMismatchException.


***Questão 2 -(program_questao2.jar)
Essa abordagem oferece uma solução simplificada conforme a saída do exemplo apresentado. Através de uma condicional que avalia o comprimento length() da String, retorna a quantidade de caracteres que faltam para completar o tamanho mínimo.

***Questão 2(Auto) - (program_questao2Auto.jar)
Essa solução apresenta uma saída mais completa. O usuário realiza um imput de senha pelo Scanner, utiliza-se as classe Pattern e Matcher onde são analisadas a cada condicional um padrão regex que atende ao critério de força de senha. O StringBuilder vai construindo a cada if a mensagem final que mostra na tela os critérios não atendidos pelo imput da senha. Variáveis booleanas asseguram que esses critérios sejam atendidos.

***Questão 3 - (program_questao3.jar)
Para esse caso é utilizado um ArrayList que irá armazenar pares de anagramas encontrados dentro de um laço for e condicionais if/else que analisão a posição de cada carácter da String e realizam comparações de igualdade. Ao final é demonstrado o comprimento da ArrayList .size() e a saída resulta no número de pares encontrados.


