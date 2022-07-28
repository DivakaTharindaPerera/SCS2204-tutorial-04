case class cart(name:Array[String], price:Array[Double],qty:Array[Int]);
var cart1=cart(Array("vanilla ice cream","chocolate biscuits","cupcakes"),Array(3.99,4,7.77),Array(13,6,7));
def displayCart(l:Int)={
    var i=0;
    for( i <- 0 to (l-1)){
        println(cart1.qty(i)+" "+cart1.name(i)+" at Rs"+cart1.price(i)+" each");
    }
}

def onlyVanilaIce(l:Int)={
    var i=0;
    for( i <- 0 to (l-1)){
        if(cart1.name(i)=="vanilla ice cream"){
            println(cart1.qty(i)+" "+cart1.name(i)+" at Rs"+cart1.price(i)+" each");
        }else{
            println("FOUND ANOTHER ITEM");
        }
    }
}

def main(args: Array[String])={
    
    val len=cart1.name.length;
    displayCart(len);
    onlyVanilaIce(len);
}