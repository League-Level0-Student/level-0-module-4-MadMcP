void setup(){
  PImage face = loadImage("face.jpg");
    size(250, 350);
    face.resize(250, 350);
    background(face);
}

void draw(){
   int d = (int)dist(mouseX, mouseY, 95, 110);
  //x- 83, y- 99, x1- 108, y1- 118
  if(d<10){
  fill(#FFFFFF);
  ellipse(95, 110, 25, 25);
  fill(#000000);
  ellipse(mouseX, mouseY, 10, 10);
  fill(#FFFFFF);
  ellipse(165, 130, 25, 25);
  fill(#000000);
  ellipse(mouseX+70, mouseY+20, 10, 10);
  }
}
