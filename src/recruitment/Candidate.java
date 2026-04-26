package recruitment;

public class Candidate {

    private String name;

    public Candidate(String name) {
        this.name = name;
    }

    public boolean acceptOffer() {
        System.out.println(name + " принял оффер");
        return true;
    }

    public String getName() {
        return name;
    }
}
