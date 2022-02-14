package coordinate;

public abstract class AbstractFigure implements Figure {
    private final PointGroup pointGroup;

    public AbstractFigure(PointGroup pointGroup) {
        if (pointGroup.getSize() != size()) {
            throw new IllegalArgumentException(getName() + "의 길이는 " + size() + "이어야 합니다.");
        }

        this.pointGroup = pointGroup;
    }

    protected Point getPoint(int index) {
        return pointGroup.getPoint(index);
    }

    @Override
    public PointGroup getPoints() {
        return pointGroup;
    }
}
