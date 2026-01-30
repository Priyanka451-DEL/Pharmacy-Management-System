
import dto.MedicineDTO;
import java.util.ArrayList;
import java.util.List;

public class MedicineDAOImpl implements MedicineDAO {

    private static List<MedicineDTO> medicines = new ArrayList<>();
    private static int idCounter = 1;

    @Override
    public void addMedicine(MedicineDTO medicine) {
        MedicineDTO newMed =
                new MedicineDTO(idCounter++, medicine.getName(),
                        medicine.getPrice(), medicine.getQuantity());
        medicines.add(newMed);
        System.out.println("Medicine Added Successfully");
    }

    @Override
    public MedicineDTO getMedicineById(int id) {
        for (MedicineDTO m : medicines) {
            if (m.getId() == id)
                return m;
        }
        return null;
    }

    @Override
    public List<MedicineDTO> getAllMedicines() {
        return medicines;
    }

    @Override
    public void updateMedicine(MedicineDTO medicine) {
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).getId() == medicine.getId()) {
                medicines.set(i, medicine);
                System.out.println("Medicine Updated");
                return;
            }
        }
        System.out.println("Medicine Not Found");
    }

    @Override
    public void deleteMedicine(int id) {
        medicines.removeIf(m -> m.getId() == id);
        System.out.println("Medicine Deleted");
    }
}
