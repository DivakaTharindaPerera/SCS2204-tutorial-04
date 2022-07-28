import scala.io.StdIn.readInt;

def EorO(x:Int)={
    if(x%2==0)
        println("Even number");
    else
        println("Odd number");
}

def main(args: Array[String])={
    var n= readInt();
    n match{
        case x if x<=0 => {
            println("Negative/Zero");
            EorO(x);
        }
        case x if x>0 => EorO(x);
    }
}