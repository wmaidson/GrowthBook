algoritmo "Media escola"
var
   primeiro_numero, segundo_numero, media: Real
inicio
      Escreval("---------------------")
      Escreval("ESCOLA DE ALGORITMO")
      Escreval("---------------------")
        Escreva("Primeira Nota: ")
        Leia(primeiro_numero)
        Escreva("Segunda Nota: ")
        Leia(segundo_numero)
		media <- (primeiro_numero + segundo_numero) / 2
      Se (media >= 7) entao
          Escreval("---------------------")
          Escreval("Media: ", media)
          Escreval("Aluno aprovado")
          Escreval("---------------------")
      Senao
           Escreval("---------------------")
           Escreval("Media: ", media)
           Escreval("Aluno Reprovado")
           Escreval("---------------------")
      FimSe
      
fimalgoritmo
