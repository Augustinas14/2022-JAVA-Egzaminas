package entetys;

public class Busnis {
    int busnisId;
    String busnisName;
    String address;

    public Busnis(int busnisId, String busnisName, String address) {
        this.busnisId = busnisId;
        this.busnisName = busnisName;
        this.address = address;
    }

    public Busnis() {
    }

    public int getBusnisId() {
        return busnisId;
    }

    public void setBusnisId(int busnisId) {
        this.busnisId = busnisId;
    }

    public String getBusnisName() {
        return busnisName;
    }

    public void setBusnisName(String busnisName) {
        this.busnisName = busnisName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
