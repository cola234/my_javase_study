package Test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//接口1
interface Ishape1{
    void draw();//抽象方法
}

class Cycle implements Ishape1{

    @Override
    public void draw() {
        System.out.println("圆");
    }
}

class Rect implements Ishape1{

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Flower implements Ishape1{

    @Override
    public void draw() {
        System.out.println("❀！");
    }
}

public class Testdemo1 {

    /*
    静态的方法用于实现多态
    接口是一种特殊的类，可以发生向上转型
     */

    public static void drawMap(Ishape1 ishape){
        ishape.draw();
    }

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        drawMap(cycle);
        Flower flower = new Flower();
        drawMap(flower);
        Rect rect = new Rect();
        drawMap(rect);
    }
}
