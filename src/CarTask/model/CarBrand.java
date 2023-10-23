package CarTask.model;

public enum CarBrand {
    SKODA("Skoda"),
    VOLKSWAGEN("Volkswagen"),
    BMW("BMW");
    private final String brandName;
    CarBrand(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName() {
        return brandName;
    }
}
