package com.whispermy.addefensebe.Repository;

        import com.whispermy.addefensebe.Domain.Member;
        import org.springframework.data.jpa.repository.JpaRepository;

        import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByusername(String username);
}
