package hr.tvz.zubcic.hardwareapp.hardware;

import java.util.List;
import java.util.Optional;

public interface HardwareRepository {

    List<Hardware> findAll();

    Optional<Hardware> findByCode(String code);

    Optional<Hardware> save(Hardware hardware);

    Optional<Hardware> update(String code, Hardware mapCommandToHardware);

    void deleteByCode(String code);
}
