package by.sadovnick.postoffice.repository;

import by.sadovnick.postoffice.entity.PostOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostOfficeRepository extends JpaRepository<PostOffice, Long> {
}
