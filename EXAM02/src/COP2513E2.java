import java.util.ArrayList;

public class COP2513E2 {

    private static class Player{
        private int speed = 0;
        private int skill = 0;
        private String name = "Anonymous";

        public Player(){

        }

        public Player(String name){
            this.name = name;
        }

        public Player(String name, int speed, int skill){
            this.name = name;
            this.speed = speed;
            this.skill = skill;
        }

        public void setAttributes(int speed, int skill){
            this.speed = speed;
            this.skill = skill;
        }

        public int getSpeed(){
            return this.speed;
        }

        public int getSkill(){
            return this.skill;
        }

        public boolean playAgainst(Player opponent){
            return (this.skill + this.speed) >= (opponent.getSkill() + opponent.getSpeed());
        }

        @Override
        public String toString() {
            return "Player " + this.name +
                    ", speed " + this.speed +
                    ", skill " + this.skill;
        }

    }

    private static class Novice extends Player{

        public Novice(){

        }

        public Novice(String name){
            super.name = name;
        }

        public Novice(String name, int speed, int skill){
            super(name, speed, skill);
        }

        @Override
        public boolean playAgainst(Player opponent){
            return false;
        }

        @Override
        public String toString() {
            return super.toString() + " (novice)";
        }
    }

    private static class Expert extends Player{

        public Expert(){

        }

        public Expert(String name){
            super.name = name;
        }

        public Expert(String name, int speed, int skill){
            super(name, speed, skill);
        }

        @Override
        public boolean playAgainst(Player opponent){
            return true;
        }

        @Override
        public String toString() {
            return super.toString() + " (expert)";
        }
    }



    public static void main(String[] args){
        Player p = new Player("WhateverDude", 3,3);
        Novice n = new Novice("noobsaurus", 2, 2);
        Expert e = new Expert("xXx420NoScopeMountainDewxXx", 2, 2);

        ArrayList<Player> players = new ArrayList<>();

        players.add(p);
        players.add(n);
        players.add(e);

        for (int i = 0; i < players.size(); i++){
            /* ALTERNATE IMPLEMENTATION
                - Question seems ambiguous about which object to call playAgainst on
            System.out.println(players.get(i).name + " versus Novice, Novice wins: " + n.playAgainst(players.get(i)));
            */
            System.out.println(players.get(i).name + " versus Novice, "
                    + players.get(i).name + " wins: " + players.get(i).playAgainst(n));
        }

        for (Player player: players){
            /* ALTERNATE IMPLEMENTATION
                - Question seems ambiguous about which object to call playAgainst on
            System.out.println(player.name + " versus Expert, Expert wins: " + e.playAgainst(player));
                    */
            System.out.println(player.name + " versus Expert, "
                    + player.name + " wins: " + player.playAgainst(e));
        }

    }
}

