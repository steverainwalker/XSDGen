package generator;

import java.util.List;
import beans.Banks;

import org.springframework.data.repository.CrudRepository;

public interface BanksRepository extends CrudRepository<Banks, Long> {

    List<Banks> findByBankName(String bankName);
}