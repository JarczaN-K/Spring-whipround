package jk.whipround.repository;

import jk.whipround.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    List<Donation> findByWhiproundId(Long whiproundId);
}
