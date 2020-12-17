package game;

public class Game {
    public static void main(String[] args) {
        Warrior player1 = new Warrior("player1", new Point(6,4) );
        Warrior player2 = new Warrior("player2", new Point(2,1) );

       while (player1.distance(player2) > 0){
            player1.move(player2);
            System.out.println(player1.toString());
            player2.move(player1);
            System.out.println(player2);
        }
        while(player1.isAlive() && player2.isAlive() ){
            player1.attack(player2);
            System.out.println(player1.toString());
            player2.attack(player1);
            System.out.println(player2.toString());
       }
        System.out.println(player1.isAlive()? "A győztes: player1" : "A győztes: player2");

    }
}
