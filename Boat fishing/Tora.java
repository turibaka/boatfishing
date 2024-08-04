public class Tora extends Object{
    
    public void perfom(){

        SquareBoat sikaku = new SquareBoat();
        sikaku.fish();
        sikaku.waterdepth();

        System.out.println();

        TriangleBoat sankaku = new TriangleBoat();
        sankaku.fish();
        sankaku.waterdepth();
        
        System.out.println();

        CircleBoat maru = new CircleBoat();
        maru.fish();
        maru.waterdepth();
    }
}
