import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "portfolios", schema = "financial_management_system")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "created_at")
    private Timestamp createdAt;

    public Portfolio() {
        // Default constructor
    }

    public Portfolio(Client client, Timestamp createdAt) {
        this.client = client;
        this.createdAt = createdAt;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
