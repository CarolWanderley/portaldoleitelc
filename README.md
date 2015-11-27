
					SISTEMA DE INFORMAÇÕES 1 - UFCG - 2015.1
					PROJETO - PORTAL DO LEITE
				
				
				Mudanças no código:
				
				Usamos Strategy na criação das classes Compara.java, ComparaConcordancia.java, 
				
				ComparaDiscordancia.java e ComparaRecente.java, a classe compara sendo a strategy, assim 
				
				ficará mais fácil de implementar novos modos de visualização da lista de dicas pelo 
				
				usuário, aumentando a extensibilidade.
				
				Dica agora possui uma variável da interface Compara que realiza a operação do seu 
				
				CompareTo() e pode ser trocada por uma variável de uma das suas classes herdeiras, além 
				
				disso ganhou uma nova variável, dataPublicacao, que serve para ordenarmos as dicas pela 
				
				data e é instanciada no momento em que criamos a dica.
				
				Uma classe para gerenciar dicas foi criada, seguindo o conceito de information expert, 
				
				assim diminuindo o número de linhas de código necessárias para criar dicas no 
				
				Application.java e simplificando a classe.
				
				MAX_TAMANHO foi criado em Application para facilitar a extensibilidade e evitar números 
				
				mágicos, se depois quisermos aumentar ou diminuir o número de posts que podem ser vistos no 
				
				index essa váriavel nos salva trabalho.
				
				Application ganhou novos métodos, tanto public como private, para ajudar na organização do 
				
				código e deixa-lo mais fácil de ler.
				
				Tema agora ou é instanciado sem nada ou se faz obrigatória a passagem de Disciplina como 
				
				parâmetro, para que seja possível acessar a disciplina de uma dica (que tem um método novo 
				
				que retorna a disciplina usando o tema para acessa-la) ou tema sem ter um 
				
				NullPointerException.    
