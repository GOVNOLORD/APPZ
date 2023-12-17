package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "books")
public class books {
    @Id
    private Integer id;
    private String title;
    @Column(name = "Author", nullable = false, unique = true, length = 40)
    private String Author;
    private String Genre;
}
