algoritmo "CalculoIMC"
var
   M, A, IMC: Real
inicio
      Escreva("Massa (Kg): ")
      Leia(M)
      Escreva ("Altura (m): ")
      Leia(A)
      IMC <- M / (A ^ 2)
      Escreval("IMC: " , IMC:5:2)
      Se (IMC >= 18.5) e (IMC < 25) entao
           Escreva("Parabens! voce esta no seu peso ideal")
      Senao
           Escreva("Voce nao esta na faixa de peso Ideal")
      FimSe

fimalgoritmo
