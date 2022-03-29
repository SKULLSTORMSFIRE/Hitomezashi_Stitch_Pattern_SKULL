import java.lang.Math;
import java.util.List;

drawline alpha;

void setup() {
  background(255);
  frameRate(1);
  size(1000, 1000);
  alpha = new drawline();
  alpha.linebuilder(1, 500);
}

void draw() {
  background(255);
  alpha = new drawline();
  alpha.linebuilder(1, 500);
}