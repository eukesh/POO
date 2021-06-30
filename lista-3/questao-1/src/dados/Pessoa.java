package dados;

public class Pessoa implements Comparable<Pessoa> {
    private String name;
    private int age;
    private String cpf;
    private String city;

    public Pessoa() {

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(name + ",");
        sb.append(age + ",");
        sb.append(cpf + ",");
        sb.append(city + ";");

        return sb.toString();
    }

    @Override
    public int compareTo(Pessoa o) {

        return getName().compareToIgnoreCase(o.getName());
    }

}
