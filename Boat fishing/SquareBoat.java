public class SquareBoat extends BoatFishing{
    
    public void fish(){
        this.size = (int)(Math.random() * 80);
        System.out.println("四角船で、"+ this.size + "cmの魚を釣った");
    }
}
