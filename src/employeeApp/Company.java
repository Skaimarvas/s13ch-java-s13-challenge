package employeeApp;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(long id, String name, int giro, String[] developerNames) {
       setId(id);
       setName(name);
       setGiro(giro);
       setDeveloperNames(developerNames);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiro() {
        return giro;
    }

    public void setGiro(int giro) {
        if (giro < 0) {
            this.giro = 0;
            System.out.println("Giro can not be less than 0");
        } else  {
            this.giro = giro;
        }

    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

    public void addEmployee(int index, String name){
        if ( developerNames[index] == null) {
            developerNames[index] = name;
        } else  {
            System.out.println("Developer name is already exist");
        }
    }
}
