public class StartFun {

    public static void main(String... args)
    {
        System.out.println("main");

        MetricMaker metricMaker = new MetricMaker();

//        if("system get set".equals("British"))
//            metricMaker.setSystem(MetricMaker.BRITISHLENGTH);



        System.out.println(metricMaker.displayNumber(20d));
        System.out.println(metricMaker.saveNumber(20d));


    }
}
