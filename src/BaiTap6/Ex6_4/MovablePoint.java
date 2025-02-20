package BaiTap6.Ex6_4;

class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    @Override
    public void moveUp() {
        y -= ySpeed;
    }
    
    @Override
    public void moveDown() {
        y += ySpeed;
    }
    
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    
    @Override
    public void moveRight() {
        x += xSpeed;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}

