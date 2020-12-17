package game;

import java.util.Random;

public class Warrior {

    private String name;
    private int stamina;
    private double skill;
    private Point position;

    Random rnd = new Random();

    public Warrior(String name, Point position) {
        this.name = name;
        this.position = position;
        this.stamina = rnd.nextInt((100 - 20) + 1) + 20;
        this.skill = Math.round(rnd.nextDouble() *100.0)/100.0;
    }


    public Point getPosition() {
        return position;
    }

    public void move(Warrior enemy){
        int newX = position.getX();
        int newY = position.getY();
        if (enemy.getPosition().getX() - position.getX() > 0) {
            newX++;
        } else if (enemy.getPosition().getX() - position.getX() < 0) {
            newX--;
        }
        if (enemy.getPosition().getY() - position.getY() > 0) {
            newY++;
        } else if (enemy.getPosition().getY() - position.getY() < 0) {
            newY--;
        }
        position = new Point(newX, newY);
    }

    public void attack(Warrior enemy){
        double skillToAttack = Math.round(rnd.nextDouble() *100.0)/100.0;
        if (skillToAttack < enemy.skill){
            int sebzes = rnd.nextInt(3)+1;
            System.out.println("sebzés: "+ sebzes);
            enemy.stamina = enemy.stamina - sebzes;
        }
        else{
            System.out.println("Nincs találat!");
        }

    }

    public double distance(Warrior enemy){
        return position.distance(enemy.getPosition());
    }

    public boolean isAlive(){
        return this.stamina > 0;
    }

    @Override
    public String toString() {
        return
                 name + ": " +skill + ": "+ "(" + position.toString() + ") " + stamina;

    }
}
