package simplePrototype.shapes;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape doClone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape) ||
            !super.equals(object2))
            return false;

        Rectangle shape2 = (Rectangle) object2;

        return shape2.width == width &&
                shape2.height == height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
