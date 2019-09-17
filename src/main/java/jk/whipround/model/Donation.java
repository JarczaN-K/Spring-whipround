package jk.whipround.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Donation {
    @Id
    @GeneratedValue(generator = "donateSeq")
    @SequenceGenerator(name = "donateSeq", sequenceName = "donate_seq", allocationSize = 1)
    private Long id;
    @ManyToOne(targetEntity = Whipround.class)
    private Whipround whipround;
    private BigDecimal amount;

    @Embedded
    private User user;

    public Donation(Whipround whipround, BigDecimal amount) {
        this.whipround = whipround;
        this.amount = amount;
        this.user = new User();
    }

    public Donation() {
        this.user = new User();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Whipround getWhipround() {
        return whipround;
    }

    public void setWhipround(Whipround whipround) {
        this.whipround = whipround;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return Objects.equals(id, donation.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
