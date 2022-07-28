import scala.compiletime.ops.string
import scala.compiletime.ops.double
import scala.io.StdIn.readDouble
def interest(n: Double):Double=n match{
    case x if x>2000000 => x*0.065;
    case x if x>200000 => x*0.035;
    case x if x>20000 => x*0.04;
    case x if x>0 => x*0.02;
}
def main(args: Array[String])={
    print("Enter the amount: ");
    var num= readDouble();
    println("Interest = "+interest(num));
    println("Total value = "+(num+interest(num)));
}