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
 }
void shrekFace()
{
   fill(159,251,0);
   ellipse(shrekX+250,shrekY+250,340,350);
   bezier(50,90,50,60,100,90,150,150);
   
}


