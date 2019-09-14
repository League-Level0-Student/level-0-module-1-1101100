  import ddf.minim.*;     //at the top of the sketch
  Minim minim;     //at the top of the sketch
  AudioPlayer sound;    //at the top of the sketch
void setup() {

  minim = new Minim(this);      //in the setup method
  sound = minim.loadFile("ding.wav");
  size(500,500);
  stroke(#AF7E12);
  fill(#D6B772);
  ellipse(250, 250, 400, 400);
  stroke(#835E0C);
  ellipse(250, 250, 300, 300);

}
void draw() {
  PImage pep = loadImage("pep.jpeg");
  pep.resize(50,50);
  sound.play();
  sound.rewind();
  if (mousePressed){
  image(pep, mouseX, mouseY);

  }
}
