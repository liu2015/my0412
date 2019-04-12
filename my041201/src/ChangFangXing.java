public class ChangFangXing {
    private int length;
    private int width;

    public ChangFangXing(){}
    public ChangFangXing(int length,int width){

        this.length=length;
        this.width=width;

    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int zhouChang(){
        return (length+width)*2;
    }
    public int area(){

        return length*width;
    }

}
