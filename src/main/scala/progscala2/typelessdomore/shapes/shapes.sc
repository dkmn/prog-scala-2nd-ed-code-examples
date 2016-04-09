/**
  *
  * Created by david on 4/9/16.
  */

import progscala2.typelessdomore.shapes._

val p1 = new Point(x=3.3, y=4.4)


val p2 = p1.copy()

val p3 = p1.copy(y= 6.6)

val s = new Circle(p1,5.0f)

s.draw(Point(1.0,2.0)){str => println(s"ShapesDrawingActoreDKK: $str")}


s.draw(Point(1.0,2.0)){str =>
  println(s"ShapesDrawingActoreDKK: $str")}


s.draw(Point(1.0,2.0)){
  str => println(s"ShapesDrawingActoreDKK: $str")
}

s.draw(){
  str => println(s"ShapesDrawingActoreDKK: $str")
}
