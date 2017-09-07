Erros conhecidos
-Caso esteja selecionado uma cedula e clique em salvar com ela selecionada aquela cedula n;ao sera salva
-Caso pule uma linha quando for carregar todos os pontos estar'ao uma posi;'ao para cima


Menu
Na aba menu cada botão leva á aba que contem o seu nome
Nas abas da secretaria 
- opção cadastro faz com que abra uma janela ao qual irá ser cadastrada as pessoas daquela secretaria
- a salvar chama a função carregarNomes e gerarMedia

Funções
- gerarMedia : gera uma média aritmética de cada pessoa
- callMenu : retorna ao menu
- carregaNomes( nome da aba que quero que os nomes sejam carregados , arquivo que contem os nomes):Carrega os nomes das pessoas cadastradas na coluna nomes da tabela de sua secretaria

Classe Gravar

GravarArquivo
grava as informações do usuário
o 001 identifica que é o começo um usuário e o 888 é seu fechamento

Classe Carregar

carrega os nomes para um vetor de strings

utiliza a variável i como um sistema de fechadura
caso leia 001 quer dizer que em seguida vem um nome
se vem um nome então cola 1 no i
se o i estiver com 1 quer dizer que o que esta lido é nome 
coloca o nome no vetor e retorna o valor de i para 0

