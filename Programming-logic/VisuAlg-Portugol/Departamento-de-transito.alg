algoritmo "Departamento de transito"
var
   ano, nasc, idade: Inteiro

inicio
      Escreval("---------------------")
      Escreval("DEPARTAMENTO DE TRANSITO")
      Escreval("---------------------")
      Escreva("Ano atual (yyyy): ")
      Leia(ano)
      Escreva("Ano de Nascimento (yyyy): ")
      Leia(nasc)
      idade <- ano - nasc
            Se (idade < 18) entao
      Escreval("--------STATUS--------")
      Escreval("Idade ", ano - nasc, " Anos")
      Escreval("Inapto a tirar carteira")
      Escreval("---------------------")
      Senao
      Escreval("--------STATUS--------")
      Escreval("Idade: ", ano - nasc, " Anos")
      Escreval("Apto a tirar carteira")
      Escreval("---------------------")
       FimSe
fimalgoritmo
