object question1 extends App{
    var a = Point(1,3);
    var b = Point(4,7);

    println(a);
    println(b);

    println(a.add(b));

    a.move(2, 4);
    println(a);

    var c = a.distance(b)
    println(c);

    a.invert()
    println(a)

}


case class Point(var x:Int, var y:Int) {  
        def add(p:Point) = new Point(x+p.x, y+p.y)

        def move(n:Int, m:Int) ={
            this.x = this.x + n;
            this.y = this.y + m;
        } 

        def distance(a:Point) = {
            var xDistnc = x - a.x;
            var yDistnc = y - a.y;
            var dist = xDistnc*xDistnc + yDistnc*yDistnc;   
            scala.math.sqrt(dist)
        }

        def invert() = {
            var temp = this.x;
            this.x = this.y;
            this.y = temp;
        }
    }