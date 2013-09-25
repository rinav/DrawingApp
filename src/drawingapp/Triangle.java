package drawingapp;

public class Triangle {
    
    private String type;
    private int height;
    
    public Triangle() {
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }
    
    public void draw() {
        System.out.println(getType() + " Triangle Drwan of height " + getHeight());
    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        this.type = type;
//    }

    public int getHeight() {
        return height;
    }
}
