package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        System.out.println("**************toString****************");
        Healthplan healthplan = new Healthplan(24232, "Kamil", Healthplan.PlanType.BASIC);
        Employee employee = new Employee(23145, "Kamil", "kamilkoca@kamil.com", "ucyuzbesyuz", new String[]{"Deneme", "Kamil"});
        Company company = new Company(25784354, "Koç Turizm", -145, new String[]{"Otbis","Minbis"});

        System.out.println(healthplan.toString());
        System.out.println(employee.toString());
        System.out.println(company.toString());
        Healthplan.PlanType planType = healthplan.getPlan();
        System.out.println("Healthplan Plan Type:" + planType);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programında ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
