package test

object Constructor extends App {

  var greet1 = new Greeting("Scala", "さようなら")
  var greet2 = new Greeting("おはようございます")
  var greet3 = new Greeting()

}


class Greeting( val name: String, var greeting: String ) {

  // デフォルトコンストラクタ
  println( name + "さん！" + greeting)

  // コンストラクタの引数が１つのとき
  def this(greeting: String) = this( "Java", greeting)
  // コンストラクタの引数がないとき
  def this() = this("こんばんわ")

}
