package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class MultiplyComposite extends Composite {

    @Override
    protected NumberLeaf createNumberLeaf() {
        return new NumberLeaf(1);
    }

    @Override
    public int getResult() {
        int result = 1;
        for (MathExpression child : children) {
            result *= child.getResult();
        }
        return result;
    }
}
