class Carro {
  var marca = ""
  var modelo = ""
  var ano = 0
}
class Car(var modelo: String, var marca: String, var ano: Int){
  fun ligar() {
    println("Wroom!")
  }
}

fun main() { 
  var GTR=Carro()
  GTR.marca="Nissan"
  GTR.modelo="GTR r34"
  GTR.ano=1999
  
  println(GTR.marca)
  println(GTR.modelo)
  println(GTR.ano)

  val c1=Car("Gallardo", "lamborghini", 2004)
  println (c1.marca)
  val Civic=Car("Civic", "Honda", 2010)
  println(Civic.marca)
  
  }