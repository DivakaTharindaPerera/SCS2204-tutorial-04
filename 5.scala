def toUpper(txt:String):String={
    txt.toUpperCase();
}

def toLower(txt:String):String={
    txt.toLowerCase();
}

def nothing(x:String):String=x;


def formateNames(name:String)(method: String => String):String={
    method(name);
}

def main(args: Array[String])={
    println(formateNames("Benny")(toUpper(_)));
    println(formateNames("Niroshan")(nothing(_)));
    println(formateNames("Saman")(toLower(_)));
    println(formateNames("Kumar")(nothing(_))+formateNames("a")(toUpper(_)));
}