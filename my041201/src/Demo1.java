public class Demo1 {
    private  int x;
    private  int y;

    public Demo1(){}
    public Demo1 (int x,int y){
        this.x=x;
        this.y=y;

    }
    public void setX(int x){
        this.x=x;

    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;

    }
    public int getY(){
        return y;
    }
    public int sum(){
        return x+y;

    }



}
