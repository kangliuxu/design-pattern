package templatemethod;

/**
 * 程序库开发人员
 */
public abstract class Library {
    public void run(){
        step1();
        if(step2()){
            step3();
        }
        step4();
        step5();
    }

    /*
    * 确定的步骤
    */
    protected void step1(){
        System.out.println("步骤1执行");
    }

    protected void step3(){
        System.out.println("步骤3执行");
    }

    protected void step5(){
        System.out.println("步骤5执行");
    }

    /**
     * 变化的地方，子类实现
     */
    protected abstract boolean step2();

    /**
     * 变化的地方，子类实现
     */
    protected abstract void step4();
}
