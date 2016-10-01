# Aplicativo Cupom Mateus

##Aplicativo Cupom API (Java + Spring)

Este projeto tem como objetivo, a partir da utiliza��o do framework Spring, criar uma API, utilizando a linguagem de programa��o Java e a IDE Eclipse, utilizando o plug-in Spring Tool Suite, servir uma aplica��o mobile armazenando informa��es de um cupom fiscal enviadas por essa aplica��o em um banco de dados Postgresql, esta api tamb�m armazena informa��es de todas as requests feitas pela aplica��o tamb�m em uma base de dados PostgreSql, a comunica��o com a aplica��o mobile � feita a partir de mensagens JSON. Para o desenvolvimento desta aplica��o foram utilizados:

    � JDK 1.8_101;

    � Eclipse JSE + Spring Tool Suite 4.6 para Windows x64;

    � Framework Spring;

    � Biblioteca Jackson;

    � JPA 2.1;

    � Postgresql  9.4.1210.

No desenvolvimento desta aplica��o foi criada uma classe JavaApiApplication que em seu m�todo main inicializa a API utilizando o Spring Boot , gerenciando as outras classes. Esta aplica��o possui tamb�m:
	
  �	Models:

    �  Cupom � informa��es de um cupom fiscal (COO, data, CNPJ e valor total) que ser�o enviadas pela aplica��o;
    
    �  Request � guarda informa��es que envolvem uma requisi��o http (Data, IP, Dispositivo, Protocolo, M�todo,
       Par�metro e Resposta).

  �	Services:

    �	CupomService � armazena as informa��es de objetos cupom em uma base de dados Postgresql;
    
    �	RequestService � armazena as informa��es de objetos Request em uma base de dados Postgresql.

  �	Controllers:

    �	CupomController � redireciona requisi��es http envolvendo objetos Cupom para seus devidos m�todos,
        transformando os JSON's recebidos pela aplica��o em objetos cupom e os armazenando em banco de dados
        quando a aplica��o envia uma informa��o (M�todo POST) e os enviando para a aplica��o (M�todo GET);
    
    �	RequestController � redireciona requisi��es http envolvendo o hist�rico de requisi��es (retorna o hist�rico
		de requisi��es).