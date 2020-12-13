## TDD-Junit
 Projeto simples para demonstrar o uso de TDD com Java e Junit

# TDD
 O TDD é um processo de desenvolvimento de software onde os testes são implementados antes do código fonte, baseando-se pelos requisitos. Neste tutorial será apresentado um exemplo da aplicação do processo no desenvolvimento de uma aplicação simples de uma loja de chocolates. Alguns [requisitos](https://github.com/RaquelCouto/TDD-Junit/blob/main/Requisitos.pdf) foram definidos para guiar a criação dos testes e posteriormente a implementação.
 
# Adicionando Junit ao projeto
Junit é um framework de testes para a linguagem Java, iremos utiliza-lo para construir os testes unitários. Após criar um novo projeto no Eclipse, clicar com botão direito no projeto > propriedades > Java Build Path > Libraries > Add Library > Junit4 > Next > Junit4 > Finish > Apply and Close, como demonstrado na figura a seguir:

![Junit](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/addJunit.png)

# Criando classes e testes

 O primeiro passo é criar a classe de testes e começar a sua implementação. Escolhemos começar pelo teste do método cadastrar já que para testar todos os outros métodos serem testados seria necessario ter produtos cadastrados. O teste criado pode ser visualizado na figura abaixo. Inicializamos um novo produto e um novo objeto do tipo controle, por fins de organização, decidimos que quando fossemos criar as classes colocaríamos os métodos de objeto em outra classe. Após a inicialização passamos como parâmetro para a função de cadastro o produto criado e utilizamos o **assertEquals**, artifício do Junit para conferir se o resultado esperado é igual ao resultado obtido em código. Como esperado, quando executamos o teste com o Junit ele é falhado pois ainda não temos nenhuma implementação. É possível notar no campo *failure trace* os problemas de compilação, é apontado que não existe nenhum construtor de produto e método cadastrar, nosso próximo passo é realizar suas implementações.
 
 ![Imagem1](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/01-Test.PNG)
 
