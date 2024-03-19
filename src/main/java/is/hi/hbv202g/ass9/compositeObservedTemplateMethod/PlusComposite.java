package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

public class PlusComposite extends Composite {

    @Override
    protected NumberLeaf createNumberLeaf() {
        return new NumberLeaf(0);
    }

    @Override
    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
}
