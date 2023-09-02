package day30_MethodOverriding;

import org.w3c.dom.ls.LSOutput;

public class OverrideParentMethod extends OriginalMethod{
    public OverrideParentMethod(String original) {
        super(original);
    }

    @Override
    public void originalMethod(int n) {
        System.out.println(original);
        System.out.println(n*n*n*n);
    }

    @Override
    public void setPrivateVariable(String privateVariable) { // when overriding setter you can only add condition to the condition from parent setter and they can not be contradicting.
        if(privateVariable.contains("D")){
            super.setPrivateVariable(privateVariable);
        } else {
            System.out.println("not acceptabel");
        }

    }
}
