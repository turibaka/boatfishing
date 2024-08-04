public abstract class BoatFishing extends Object{
    
    public int size = 0;

    public int waterdepth = 0;

    public void waterdepth(){
        this.waterdepth = (int)(Math.random() * 40);
        System.out.println("釣れた水深は" + waterdepth + "Mだった。");
    }

    public abstract void fish();


}
