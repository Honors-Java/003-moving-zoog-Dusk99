void setup() {
	size(300, 300);
 background(255) 
}

void draw() {
	 // Draw a white background
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);

  background(200);
  // Set CENTER mode
  ellipseMode(CENTER);
  rectMode(CENTER);
  // Draw Zoog's body
  stroke(0);
  fill(mouseX,mouseY,150);
  rect(mouseX, mouseY,20,100);
  // Draw Zoog's head
  stroke(0);
  fill(mouseY,mouseX,255);
  ellipse(mouseX, mouseY - 30,60,60);
  // Draw Zoog's eyes
  fill(0);

  // remove the forward slashes in front of each line of code below one at a time. Remove the underline and replace with the proper code to allow your mouse to move Zoog around  💻

  ellipse(mouseX -12, mouseY -32,16,32);
  ellipse(mouseX +12, mouseY -32,16,32);
  // Draw Zoog's legs
  stroke(0);
  line(mouseX - 10, mouseY + 50, mouseX - 20, mouseY + 90);
  line(mouseX + 10, mouseY + 50, mouseX + 20, mouseY + 90);
}