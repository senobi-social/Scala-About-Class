package test

object Method extends App {

  // addressのインスタンスを生成
  val address = new Address()

  // 各メソッドを実行
  address.nonArgument
  address.isNotAppointedArgument()
  address.onlyOneArgument("京都府")
  address.pluralArguments("京都府", "京都市")


}

class Address {

  def nonArgument = {
    println("引数がありません。")
  }

  def isNotAppointedArgument() = {
    println("都道府県、市町村の指定がありません。")
  }

  def onlyOneArgument( prefectures: String) = {
    println("都道府県は" + prefectures + "です。" )
  }

  def pluralArguments
  ( prefectures: String, cityTownVillage: String) = {

    println("都道府県は" + prefectures + "で、市町村は"
      + cityTownVillage + "です。")

  }
}
