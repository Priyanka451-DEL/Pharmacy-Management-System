
import java.util.List;

public class MedicineService {

    private MedicineDAO dao = new MedicineDAOImpl();

    public void add(MedicineDTO m) {
        dao.addMedicine(m);
    }

    public MedicineDTO getById(int id) {
        return dao.getMedicineById(id);
    }

    public List<MedicineDTO> getAll() {
        return dao.getAllMedicines();
    }

    public void update(MedicineDTO m) {
        dao.updateMedicine(m);
    }

    public void delete(int id) {
        dao.deleteMedicine(id);
    }
}
