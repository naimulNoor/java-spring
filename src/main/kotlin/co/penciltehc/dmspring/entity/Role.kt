import co.penciltehc.dmspring.entity.User
import com.fasterxml.jackson.annotation.JsonTypeInfo
import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @Column(nullable = false, unique = true)
    private val name: String? = null

    @ManyToMany(mappedBy = "roles")
    private val users: List<User>? = null
}