package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    public boolean addRecord(FroggerID froggerID) {
        if (this.records.contains(froggerID)) {
            return false;
        }
        this.records.add(froggerID);
        return true;
    }

    /**
     * Backward-compatible overload that delegates to the parameter object.
     */
    public boolean addRecord(String firstName, String lastName, String phoneNumber,
                             String zipCode, String state, String gender) {
        return addRecord(new FroggerID(firstName, lastName, phoneNumber, zipCode, state, gender));
    }
}
