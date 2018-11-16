package orca.Iterator;

public class Test {

    @org.junit.jupiter.api.Test
    public void test(){

        CompanyA companyA = new CompanyA();

        Iterator iterator = companyA.CreateIterator();

        while(!iterator.IsDone()){
            System.out.println( ((Employee)iterator.CurrentItem()).name + " : " +  ((Employee)iterator.CurrentItem()).title + " 發薪水囉～");
            iterator.Next();
        }

    }
}
