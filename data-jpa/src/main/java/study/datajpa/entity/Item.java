package study.datajpa.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Persistable;

@Entity
@NoArgsConstructor
public class Item implements Persistable<String> {

    @Id@
    GeneratedValue
    private Long id;

    @Override
    public String getId() {
        return "";
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
