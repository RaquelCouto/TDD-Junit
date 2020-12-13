## TDD-Junit
 Projeto simples para demonstrar o uso de TDD com Java e Junit

# TDD
 O TDD (*Test-driven development*) é um processo de desenvolvimento de software onde os testes são implementados antes do código fonte, baseando-se pelos requisitos. Neste tutorial será apresentado um exemplo do processo no desenvolvimento em uma aplicação simples de uma loja de chocolates. Alguns [requisitos](https://github.com/RaquelCouto/TDD-Junit/blob/main/Requisitos.pdf) foram definidos para guiar a criação dos testes e posteriormente a implementação.
 
# Adicionando Junit ao projeto
Junit é um framework de testes para a linguagem Java, iremos utiliza-lo para construir os testes unitários. Após criar um novo projeto no Eclipse, clicar com botão direito no projeto > propriedades > Java Build Path > Libraries > Add Library > Junit4 > Next > Junit4 > Finish > Apply and Close, como demonstrado na figura a seguir:

![Junit](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/addJunit.png)

# Criando classes e testes

O primeiro passo é criar a classe de testes e começar a sua implementação. Escolhemos começar pela criação do teste do método cadastrar, já que para testar todos os outros métodos seria necessario ter produtos cadastrados. O teste criado pode ser visualizado na figura abaixo. Inicializamos um novo produto e um novo objeto do tipo controle e por fins de organização, decidimos que quando fossemos criar as classes colocaríamos os métodos de **Produto** em outra classe. Após a inicialização, passamos como parâmetro para a função de cadastro o Produto criado e utilizamos o **assertEquals**, artifício do Junit para conferir se o resultado esperado é igual ao resultado obtido em código. Como esperado, quando executamos o teste com o Junit ele é falhado, pois ainda não temos nenhuma implementação. É possível notar no campo *failure trace* os problemas de compilação: é apontado que não existe nenhum construtor de produto e método cadastrar, nosso próximo passo é realizar suas implementações.
 
 ![Imagem1](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/01-Test.PNG)
 
Criamos a classe de produto e a classe de controle e realizamos as implementações necessárias, quando retornamos a classe de teste e executamos novamente o Junit, o teste passa (Vide figura abaixo). Desta forma, podemos seguir em frente e criar um novo teste, pois em TDD só podemos escrever outro teste unitário quando o teste atual passa. 
 
![Imagem3](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/02-Produto.PNG)
![Imagem2](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/02-Main.PNG)
![Imagem3](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/02-Test.PNG)

O próximo teste a ser escrito é o de listar todos os produtos, a sua implementação pode ser vista na imagem a seguir:

![Imagem4](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/03-Test.PNG)

Criamos dois objetos do tipo produto, os cadastramos e chamamos a função de listagem. Mais uma vez, quando executamos o teste ele falha: é necessário implementar o método listar. Partimos para a implementação do método e executamos novamente a classe de teste, dessa vez, o teste passa, como podemos ver nas imagens abaixo:

![Imagem5](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/04-Main.PNG)
![Imagem6](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/04-Test.PNG)

Como o teste passou, seguimos para outro teste e continuamos nesse ritmo até finalizar os requisitos: <span style="background-color: #FFFF00">implementar o teste > ver ele falhar > fazer a implementação do código fonte > executar o teste novamente</span>, caso passe, partir para outro requisito. A implementação completa dos testes e dos métodos pode ser vistas nas imagens a seguir:
 
![Imagem7](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/10-Main.PNG)
![Imagem8](https://github.com/RaquelCouto/TDD-Junit/blob/main/Imagens/10-Test.PNG)

# Conclusão

Neste tutorial, buscamos apresentar de maneira simples o uso de TDD na prática. Os autores perceberam que o uso de TDD no desenvolvimento de software nos ajuda a pensar melhor no planejamento/design do sistema a ser desenvolvido, a medida que, ao criarmos os testes já começamos a imaginar quais estruturas de dados e classes utilizaremos na implementação.

