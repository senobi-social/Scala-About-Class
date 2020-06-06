package test

object Object extends App {

  // Objectの呼び出し
  Greeting2.greeting( 3 )

  // Classの呼び出し
  val greet = new Greeting2("sora")
}

// ClassとObjectは同じファイルに存在しなくてはいけない
// 同一のクラス名がパッケージ内に存在してはいけない
class Greeting2( name : String) {
  println( "はじめまして！" + name + "さん！")
}

object Greeting2 {
  private val opponent = "世界"

  def greeting( NumberOfTimes: Int ) = {

    var i = 0; for(i <- 1 to NumberOfTimes )
      println(i + "回目:" + this.opponent + "の皆さんこんにちは！")
  }
}
