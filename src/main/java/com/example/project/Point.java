package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      int diffx = x - other.x; 
      int diffy = y - other.y; 
      return Math.sqrt(Math.pow(diffx, 2) + Math.pow(diffy, 2)); 
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")"; 
    }

    public int getX(){
      return x; 
    }

    public int getY(){
      return y; 
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
  }
  