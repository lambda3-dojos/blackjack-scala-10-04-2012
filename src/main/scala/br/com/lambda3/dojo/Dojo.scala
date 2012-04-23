package br.com.lambda3.dojo

object Converters {
  implicit def pimpMyString(numero: String) = new {
    def isFigure(): Boolean = {
      numero == "Q" || numero == "K" || numero == "J"
    }
  }
}

class Carta(numero: String) {
  import Converters._

  def this(numero: Int) = this(numero.toString())

  def valor: Int = {
    if (this.numero == "A") return 11
    if (numero.isFigure) return 10
    this.numero.toInt
  }
}

class Mao {
  var soma = 0
  var numeroDeAs = 0

  def addCarta(carta: Carta) {
    if (carta.valor == 11) numeroDeAs += 1
    soma += carta.valor
  }

  def total: Int = {
    while (numeroDeAs > 0 && soma > 21) {
      soma -= 10
      numeroDeAs -= 1
    }
    soma
  }

  def isBlackjack = true
}