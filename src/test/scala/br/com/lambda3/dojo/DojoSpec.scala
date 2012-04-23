package br.com.lambda3.dojo

import org.specs2.mutable.Specification

class DojoSpec extends Specification {

  "um 2 " should {
    "valer 2" in {
      new Carta("2").valor must beEqualTo(2)
    }
  }

  "um K" should {
    "valer 10" in {
      new Carta("K").valor must beEqualTo(10)
    }
  }

  "um As" should {
    "valer 11" in {
      new Carta("A").valor must beEqualTo(11)
    }
  }

  "um 3" should {
    "valer 3" in {
      new Carta(3).valor must beEqualTo(3)
    }
  }

  "uma mao" should {
    "contar K + 8 deve ser 18" in {
      val mao = new Mao()
      mao.addCarta(new Carta("K"))
      mao.addCarta(new Carta("8"))
      mao.total must beEqualTo(18)
    }

    "contar Q + 3 + 2 deve ser 15" in {
      val mao = new Mao()
      mao.addCarta(new Carta("Q"))
      mao.addCarta(new Carta("3"))
      mao.addCarta(new Carta("2"))
      mao.total must beEqualTo(15)
    }

    "contar A + A deve ser 12" in {
      val mao = new Mao()
      mao.addCarta(new Carta("A"))
      mao.addCarta(new Carta("A"))
      mao.total must beEqualTo(12)
    }

    "contar K + K + 2 deve ser 22" in {
      val mao = new Mao()
      mao.addCarta(new Carta("K"))
      mao.addCarta(new Carta("K"))
      mao.addCarta(new Carta(2))
      mao.total must beEqualTo(22)
    }

    "contar A + Q + 2 deve ser 13" in {
      val mao = new Mao()
      mao.addCarta(new Carta("A"))
      mao.addCarta(new Carta("Q"))
      mao.addCarta(new Carta(2))
      mao.total must beEqualTo(13)
    }

    "somar A + A + A deve ser 13" in {
      val mao = new Mao()
      mao.addCarta(new Carta("A"))
      mao.addCarta(new Carta("A"))
      mao.addCarta(new Carta("A"))
      mao.total must beEqualTo(13)
    }

    "somar A + A + A duas vezes deve ser sempre 13" in {
      val mao = new Mao()
      mao.addCarta(new Carta("A"))
      mao.addCarta(new Carta("A"))
      mao.addCarta(new Carta("A"))
      mao.total must beEqualTo(13)
      mao.total must beEqualTo(13)
    }

    "verificar se a mao eh blackjack" in {
      val mao = new Mao()
      mao.addCarta(new Carta("A"))
      mao.addCarta(new Carta("K"))
      mao.isBlackjack must beTrue
    }
  }

}
