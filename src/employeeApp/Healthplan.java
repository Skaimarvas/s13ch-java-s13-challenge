package employeeApp;

public class Healthplan {
    private long id;
    private String name;
    private  PlanType plan;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Healthplan(long id, String name, PlanType plan) {
       setId(id);
       setName(name);
       setPlan(plan);
    }

    public PlanType getPlan() {
        return plan;
    }

    public void setPlan(PlanType plan) {
        this.plan = plan;
    }

    public enum PlanType {
        BASIC("Basic", 100),
        STANDARD("Standard", 200),
        PREMIUM("Premium", 300);

        private String name;
        private int price;
        PlanType(String name,int price){
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
}
