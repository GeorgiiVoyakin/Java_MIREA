package ru.mirea.ikbo1319.task3;

public class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;
    private double legsLength;
    private double handsLength;

    public Human(){

        head = new Head();
        handsLength = 40;
        legsLength = 60;
        leftHand = new Hand(handsLength);
        rightHand = new Hand(legsLength);
        leftLeg = new Leg(legsLength);
        rightLeg = new Leg(legsLength);
    }

    public void setLegsLength(double length){
        legsLength = length;
    }

    public double getLegsLength() {
        return legsLength;
    }

    public void setHandsLength(double length){
        handsLength = length;
    }

    public double getHandsLength() {
        return handsLength;
    }
    
    public void setHairColor(String color){
        if (head.hair){
            head.hairColor = color;
        }
    }
    
    public void setHair(boolean hair){
        head.hair = hair;
    }
    
    public String getHairColor(){
        return head.hairColor;
    }

    public boolean getHair(){
        return head.hair;
    }

    private class Leg{
        double length;
        public Leg(double length){
            this.length = length;
        }
    }

    private class Hand{
        double length;
        public Hand(double length){
            this.length = length;
        }
    }

    private class Head{
        boolean hair;
        String hairColor;
        public Head(){
            hair = true;
            hairColor = "Brown";
        }

        public Head(String hairColor){
            hair = true;
            this.hairColor = hairColor;
        }

        public Head(boolean hairs, String hairColor){
            this.hair = hairs;
            if (hairs){
                this.hairColor = hairColor;
            }else{
                this.hairColor = "none";
            }
        }
    }
}
