PImage creeper;
int creeperX=(int)random(0, 500);
int creeperY=(int)random(0, 500);

void setup(){
  size(500, 500);
  PImage minecraft = loadImage("minecraft.png");
  minecraft.resize(500, 500);
  background(minecraft);
  creeper=loadImage("creeper.png");
  creeper.resize(5, 5);
}

void draw(){
  image(creeper, creeperX, creeperY);
  if(mousePressed){
    if(mouseX - creeperX < 20 && mouseY - creeperY < 20){
     fill(#008310);
     ellipse(mouseX, mouseY, 25, 25);
     textSize(24);
     fill(#000000);
     text("You found it!", 20, 20);
     creeperX=(int)random(0, 500);
     creeperY=(int)random(0, 500);
    }
    else{
      fill(#FF0000);
      ellipse(mouseX, mouseY, 25, 25);
    } 
  }
}