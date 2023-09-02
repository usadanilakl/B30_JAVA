package day30_MethodOverriding;

public class OriginalMethod {
    public String original;
    private String privateVariable;

    public void setPrivateVariable(String privateVariable) {
        if(!privateVariable.contains("D"))
        this.privateVariable = privateVariable;
        else this.privateVariable="not set";
    }

    public OriginalMethod(String original){
        this.original = original;
    }

    public String getPrivateVariable() {
        return privateVariable;
    }

    public void originalMethod(int n){
        System.out.println(original);
        System.out.println(n*n);
    }
}
