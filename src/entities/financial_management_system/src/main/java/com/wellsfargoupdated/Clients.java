import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "clients", schema = "financial_management_system")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clientId;

    @Column(name = "client_name", nullable = false, length = 100)
    private String clientName;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @Column(name = "created_at")
    private Timestamp createdAt;

    public Client() {
        // Default constructor
    }

    public Client(String clientName, FinancialAdvisor advisor, Timestamp createdAt) {
        this.clientName = clientName;
        this.advisor = advisor;
        this.createdAt = createdAt;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public FinancialAdvisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(FinancialAdvisor advisor) {
        this.advisor = advisor;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
