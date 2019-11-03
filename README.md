### TEST DUMMY JAVA
![Alt Text](https://github.com/yinicius/poo2019.1/blob/master/foto.gif)

CONCEITOS BÁSICOS DE OO

Método - São os comportamentos/ações de um objeto. São as coisas que o objeto FAZ. Ex: um carro pode correr, frear, acelerar (métodos de do carro).

Atributo - São as características do objeto. São as coisas que o objeto TEM. Ex: um carro tem cor, modelo, marca (atributos do carro).

Objeto - É uma representação de uma entidade do mundo real no sistema. Guardando suas características e comportamentos. São instâncias de classes.

Encapsulamento - É um dos quatro pilares da OO. Serve para limitar o acesso a atributos/métodos e até classes, através de modificadores de acesso. Em Java, esses modificadores são
	public: toda classe tem acesso
	private: só a classe proprietária tem acesso
	protected: a classe proprietária, suas descendentes (herança) e classes do mesmo pacote têm acesso
	default: a classe proprietária e classe do mesmo pacote têm acesso.

Abstração - Abstração de procedimentos, é separar o programa em partes (subprogramas, classe, etc.) de forma a ignorar detalhes de implementação. Abstração de dados, é uma forma de tentar representar algo do mundo real no nosso sistema (ex: como representar) um aluno no SIPPA). Abstração de dados é um dos quatro pilares da OO.

Pacote - Um pacote representa um conjunto de classes que tem uma mesma função semântica no código. Separamos as classes em pacotes como um forma de organização. Um pacote é representado por uma pasta que contém um arquivo de uma classe se e somente se a classe está dentro desse pacote.

Classe - É uma entidade que contém os atributos e os métodos de um objeto. Em outras palavras, ela diz as características e comportamentos de um objeto.

Construtor - É um método especial de um objeto chamado no momento em que o objeto é criado. Já existe por padrão, mas podemos sobrescrevê-lo colocando os comportamentos que queremos. Geralmente o usamos para inicializar os atributos do objeto.

toString - É um método especial do objeto chamado no momento em que tentamos converter o objeto em String. Esse método retorna uma String que é o objeto convertido em String. Por padrão, já existe (no Java), mas podemos sobrescrevê-lo. Geralmente retornamos uma String com os atributos do objeto.
