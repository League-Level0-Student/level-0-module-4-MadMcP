import ddf.minim.*;
AudioSample woohooSound;
boolean playSound = true;
PImage donkey;
PImage tail;
int y;
int x;
boolean pressed = false;

void setup(){
 Minim minim = new Minim(this);
 woohooSound = minim.loadSample("ding-1.wav");
 donkey = loadImage("Donkey.jpeg");
 tail = loadImage("Tail.png");
 size(524, 386);
 donkey.resize(524, 386);
}

void draw(){
 background(donkey);
 rect(0, 0, 30, 30);
 if (dist(0, 0, mouseX, mouseY) > 30) {
   background(#FFFFFF);
 }
  if(mousePressed){
   pressed = true;
   y = mouseY;
   x = mouseX;
  image(tail, x, y);
 }
 if(pressed==false) {
  image(tail, mouseX-10, mouseY-20);
 }
 else if(pressed==true){
   image(tail, x, y);
   background(donkey);
   if(dist(425, 147, x, y) < 40){
     if (playSound) {
     woohooSound.trigger();
     playSound = false;
   }
  }
 }
 textSize(10);
 fill(#000000);
 text("Pin the tail by clicking where you think the tail goes. If you hear a chime, you won!", 100, 20);
}