

import dto.MedicineDTO;
import java.util.List;

public interface MedicineDAO {
    void addMedicine(MedicineDTO medicine);
    MedicineDTO getMedicineById(int id);
    List<MedicineDTO> getAllMedicines();
    void updateMedicine(MedicineDTO medicine);
    void deleteMedicine(int id);
}
