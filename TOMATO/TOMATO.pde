void setup()
{
  size(400,400);
    background(200, 200, 200);
    noStroke();
    fill(210,0,40);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(50,175,10);
    rect(176, 103, 12, 32);
}
    void draw()
    {
    if (mousePressed)
  {
    fill(200, 200, 200);
  ellipse(212, 200, 150, 150);
  }
    }