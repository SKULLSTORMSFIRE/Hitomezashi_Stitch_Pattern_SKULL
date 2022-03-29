class drawline {

  drawline() {
  }

  void linebuilder(int startpos, int sizegrid) {
    int startrowlines = sizegrid, startcolumnlines = startrowlines, origin = -1000;

    pushMatrix();
    translate(origin, origin);
    rotate(radians(0));
    //circle(0, 0, 10);
    for (int j = 0; j <= startcolumnlines; j++) {
      //print(j);
      startpos = int(random(2));
      for (int i = 0; i <= startrowlines; i++) {
        //print(i,"  ");
        if (startpos == 1 && i%2 == 1) {
          //odds
          line ((10*i)+(j*5), (8.66025*j), (10*i)+10+(j*5), (8.66025*j));
        } else if (startpos == 0 && i%2 == 0) {
          line ((10*i)+(j*5), (8.66025*j), (10*i)+10+(j*5), (8.66025*j));
          //evens
        }
      }
      startrowlines--;
    }
    popMatrix();

    startrowlines = sizegrid; 
    startcolumnlines = startrowlines;
    pushMatrix();
    translate(origin+(10*(sizegrid+1)), origin);
    rotate(radians(120));
    //circle(0, 0, 10);
    for (int j = 0; j <= startcolumnlines; j++) {
      //print(j);
      startpos = int(random(2));
      for (int i = 0; i <= startrowlines; i++) {
        //print(i, "  ");
        if (startpos == 1 && i%2 == 1) {
          //odds
          line ((10*i)+(j*5), (8.66025*j), (10*i)+10+(j*5), (8.66025*j));
        } else if (startpos == 0 && i%2 == 0) {
          line ((10*i)+(j*5), (8.66025*j), (10*i)+10+(j*5), (8.66025*j));
          //evens
        }
        random(1);
      }
      startrowlines--;
    }
    popMatrix();  

    startrowlines = sizegrid; 
    startcolumnlines = startrowlines; 
    //print(sqrt(0.75*(10*(sizegrid+1))*(10*(sizegrid+1))));
    pushMatrix();
    translate((origin+(10*(sizegrid+1))/2), origin+sqrt(0.75*(10*(sizegrid+1))*(10*(sizegrid+1))));
    rotate(radians(240));
    //circle(0, 0, 10);
    for (int j = 0; j <= startcolumnlines; j++) {
      //print(j);
      startpos = int(random(2));
      //print(startpos);
      for (int i = 0; i <= startrowlines; i++) {
        //print(i, "  ");
        if (startpos == 1 && i%2 == 1) {
          //odds
          line ((10*i)+(j*5), (8.66025*j), (10*i)+10+(j*5), (8.66025*j));
        } else if (startpos == 0 && i%2 == 0) {
          line ((10*i)+(j*5), (8.66025*j), (10*i)+10+(j*5), (8.66025*j));
          //evens
        }
      }
      startrowlines--;
    }
    popMatrix();
  }
}
