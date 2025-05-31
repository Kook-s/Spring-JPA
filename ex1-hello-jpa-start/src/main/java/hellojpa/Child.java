package hellojpa;

import jakarta.persistence.*;

@Entity
public class Child {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "perent_id")
    private Perent perent;

    public Perent getPerent() {
        return perent;
    }

    public void setPerent(Perent perent) {
        this.perent = perent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
