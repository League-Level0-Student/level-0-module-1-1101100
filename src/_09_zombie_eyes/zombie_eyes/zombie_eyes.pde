
void setup() {
  size(500, 500);
  PImage face = loadImage("images.jpeg");
  face.resize(500, 500);
  image(face, 0, 0);
  face.resize(500, 500);
}
void draw() {
  fill(mouseX, mouseY, mouseX);
  ellipse(205, 215, 20, 20);
  fill(mouseX, mouseY, mouseX);
  ellipse(290, 215, 20, 20);
}
