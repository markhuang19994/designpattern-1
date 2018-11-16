package orca.BuilderMode;

public class ConcreteBuilder1 extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void build1() {
        buffer.append("Builder1 : Part1 \n");
    }

    @Override
    public void build2() {
        buffer.append("Builder1 : Part2 \n");
    }

    @Override
    public void build3() {
        buffer.append("Builder1 : Part3 \n");
    }

    public String getResult() {//定義獲取最終生成實例的方法
        return buffer.toString();
    }

}
