void setup(){
  size(500, 500);
}

void draw(){
  for (int split = 0; split < 3; split++){
    fill(#1A1818);
    text("ice cream", 250, 250 + (split*10));
  }
    text("banana", 250, 300);
}
