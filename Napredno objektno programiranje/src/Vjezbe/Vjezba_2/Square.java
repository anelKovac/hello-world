package Vjezbe.Vjezba_2;

public class Square extends Quad implements Geom{



    @Override
    public double racunajPovrsinu() {
        return this.a * this.a;
    }

    @Override
    public double racunajObim() {
        return this.a * 4;
    }

    @Override
    public void setValues(int x, int y ,int a) {
        this.x = x;
        this.y = y;
        this.a = a;
    }
}
