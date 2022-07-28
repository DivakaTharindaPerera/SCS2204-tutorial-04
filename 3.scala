import scala.language.implicitConversions;

case class Car(name:String,price:Double);

class caruuid(car: Car){
    def uuid: String =s"car uuid = ${car.name} - ${car.name.hashCode}";
}

object carnames{
    implicit def uuid(car:Car):caruuid = new caruuid(car);
}

import carnames._
val bmw3 = Car("bmw 3 series", 20000);
val bmw5 = Car("bmw 5 series", 50000);
val vwPassat = Car("vw passat", 10000);
val vwGolf = Car("vw golf", 12000);
val mazda3 = Car("mazda 3", 15000);

def main(args: Array[String])={
    val list= List(bmw3,bmw5,vwPassat,vwGolf,mazda3);
    list.foreach(car=>println(car.uuid));
}