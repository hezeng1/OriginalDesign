void setup()
{
  size(500,500);
}
int shrekX = 1;
int shrekY = 2; 
void draw()
{
  background(20,30,40);
  shrekFace();
  shrekEyes(); 
 }
void shrekFace()
{
   fill(159,251,0);
   ellipse(shrekX+250,shrekY+250,340,350);
   bezier(50,90,50,60,100,90,150,150);
   bezier(350,150,390,150,360,100,450,90);
   
}
void shrekEyes()
{
   fill((int)(Math.random()*254),(int)(Math.random()*256),(int)(Math.random()*256));
   ellipse(180,220,70,40);
   ellipse(280,220,70,40);
}

