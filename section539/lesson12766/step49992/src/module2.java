/**
 * Created by AVK on 06.04.2017.
 */
public class module2 {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Direction.UP);
        System.out.println("Before: X: " + robot.x + ", " + "Y: " + robot.y + ", " + "Direction: " + robot.dir  );
        moveRobot(robot, 0, 0);
        System.out.println("After: X: " + robot.getX() + ", " + "Y: " + robot.getY() + ", " + "Direction: " + robot.getDirection()  );
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // your code
        Direction currentDir = robot.getDirection();
        int currentX = robot.getX();
        int currentY = robot.getY();

        if (robot.getX() == toX && robot.getY() == toY){
            return;
        }



        if (robot.getX() == toX && robot.getY() != toY){
            if (robot.getY() > toY) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnRight();
                    for (int i = 0; i < Math.abs(toY - currentY); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.LEFT){
                    robot.turnLeft();
                    for (int i = 0; i < Math.abs(toY - currentY); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.UP){
                    robot.turnLeft();
                    robot.turnLeft();
                    for (int i = 0; i < Math.abs(toY - currentY); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.DOWN){
                    for (int i = 0; i < Math.abs(toY - currentY); i++) {
                        robot.stepForward();
                    }
                }
            }

            if (robot.getY() < toY) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                    for (int i = 0; i < Math.abs(toY - currentY); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.LEFT){
                    robot.turnRight();
                    for (int i = 0; i < Math.abs(toY - currentY); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.UP){
                    for (int i = 0; i < Math.abs(toY - currentY); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.DOWN){
                    robot.turnRight();
                    robot.turnRight();
                    for (int i = 0; i < Math.abs(toY - currentY); i++) {
                        robot.stepForward();
                    }
                }
            }
        }



        if ( robot.getY() == toY && robot.getX() != toX) {

            if (robot.getX() < toX) {
                if (robot.getDirection() == Direction.RIGHT) {
                    for (int i = 0; i < Math.abs(toX - currentX); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.DOWN){
                    robot.turnLeft();
                    for (int i = 0; i < Math.abs(toX - currentX); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.LEFT){
                    robot.turnRight();
                    robot.turnRight();
                    for (int i = 0; i < Math.abs(toX - currentX); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.UP){
                    robot.turnRight();
                    for (int i = 0; i < Math.abs(toX - currentX); i++) {
                        robot.stepForward();
                    }
                }
            }

            if (robot.getX() > toX) {
                if (robot.getDirection() == Direction.RIGHT) {
                    robot.turnLeft();
                    robot.turnLeft();
                    for (int i = 0; i < Math.abs(toX - currentX); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.DOWN){
                    robot.turnRight();
                    for (int i = 0; i < Math.abs(toX - currentX); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.LEFT){
                    for (int i = 0; i < Math.abs(toX - currentX); i++) {
                        robot.stepForward();
                    }
                } else if (robot.getDirection() == Direction.UP){
                    robot.turnLeft();
                    for (int i = 0; i < Math.abs(toX - currentX); i++) {
                        robot.stepForward();
                    }
                }
            }
        }




        if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.RIGHT) {
                for (int i = 0; i < Math.abs(toX - currentX); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.DOWN){
                robot.turnLeft();
                for (int i = 0; i < Math.abs(toX - currentX); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.LEFT){
                robot.turnRight();
                robot.turnRight();
                for (int i = 0; i < Math.abs(toX - currentX); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.UP){
                robot.turnRight();
                for (int i = 0; i < Math.abs(toX - currentX); i++) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getX() > toX) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                robot.turnLeft();
                for (int i = 0; i < Math.abs(toX - currentX); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.DOWN){
                robot.turnRight();
                for (int i = 0; i < Math.abs(toX - currentX); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.LEFT){
                for (int i = 0; i < Math.abs(toX - currentX); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.UP){
                robot.turnLeft();
                for (int i = 0; i < Math.abs(toX - currentX); i++) {
                    robot.stepForward();
                }
            }
        }




        if (robot.getY() > toY) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnRight();
                for (int i = 0; i < Math.abs(toY - currentY); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.LEFT){
                robot.turnLeft();
                for (int i = 0; i < Math.abs(toY - currentY); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.UP){
                robot.turnLeft();
                robot.turnLeft();
                for (int i = 0; i < Math.abs(toY - currentY); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.DOWN){
                for (int i = 0; i < Math.abs(toY - currentY); i++) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getY() < toY) {
            if (robot.getDirection() == Direction.RIGHT) {
                robot.turnLeft();
                for (int i = 0; i < Math.abs(toY - currentY); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.LEFT){
                robot.turnRight();
                for (int i = 0; i < Math.abs(toY - currentY); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.UP){
                for (int i = 0; i < Math.abs(toY - currentY); i++) {
                    robot.stepForward();
                }
            } else if (robot.getDirection() == Direction.DOWN){
                robot.turnRight();
                robot.turnRight();
                for (int i = 0; i < Math.abs(toY - currentY); i++) {
                    robot.stepForward();
                }
            }
        }

        if (robot.getX() == toX && robot.getY() == toY){
            return;
        }




    }
}
