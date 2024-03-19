package is.hi.hbv202g.ass9.compositeObserved;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {
    
    private List<MathExpression> children = new ArrayList<MathExpression>();
    private int lastObservedResult;
    private NumberLeaf number;

    
    
    public PlusComposite() {
        number = new NumberLeaf(0);
        number.attach(this);
    }
    
    public void add(MathExpression component){
        children.add(component);
    }

    public void remove(MathExpression component) {
        children.remove(component);
    }

    public List<MathExpression> getChildren() {
        return children;
    }

    @Override
    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }

    @Override
    public void update() {
        if (number != null) {
            children.add(number);
            lastObservedResult = getResult();
            System.err.println(lastObservedResult);
        }
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

}
